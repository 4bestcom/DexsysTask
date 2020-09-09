package Data;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Data {
    private List<Integer> list1;
    private List<Integer> list2;
    private List<Integer> list3;
    private boolean isAnyMore;


    public boolean isAnyMore() {
        return isAnyMore;
    }

    public void initArray(int[] array) {
        IntStream
                .range(0, array.length)
                .forEach(i -> {
                    if (array[i] % 3 != 0 && array[i] % 7 != 0 && array[i] % 21 != 0) isAnyMore = true;
                });
        list1 = Arrays.stream(array).filter(x -> x % 3 == 0).distinct().sorted().boxed().collect(Collectors.toList());
        list2 = Arrays.stream(array).filter(x -> x % 7 == 0).distinct().sorted().boxed().collect(Collectors.toList());
        list3 = Arrays.stream(array).filter(x -> x % 21 == 0).distinct().sorted().boxed().collect(Collectors.toList());

    }

    public void print() {
        if (list1.isEmpty()) {
            System.out.println("Список X пуст");
        } else {
            list1.forEach(x -> System.out.print(x + " "));
            System.out.println();
        }
        if (list2.isEmpty()) {
            System.out.println("Список S пуст");
        } else {
            list2.forEach(x -> System.out.print(x + " "));
            System.out.println();
        }
        if (list3.isEmpty()) {
            System.out.println("Список M пуст");
        } else {
            list3.forEach(x -> System.out.print(x + " "));
        }
    }

    public void printType(String value) {
        switch (value) {
            case "X":
                if (list1.isEmpty()) {
                    System.out.println("Список X пуст");
                } else {
                    list1.forEach(x -> System.out.print(x + " "));
                }
                break;
            case "S":
                if (list2.isEmpty()) {
                    System.out.println("Список S пуст");
                } else {
                    list2.forEach(x -> System.out.print(x + " "));
                }
                break;
            case "M":
                if (list3.isEmpty()) {
                    System.out.println("Список M пуст");
                } else {
                    list3.forEach(x -> System.out.print(x + " "));
                }
                break;
            default:
                System.out.println("Выберите значение X, S или M");
                break;
        }
    }

    public void clearType(String value) {
        switch (value) {
            case "X":
                list1.clear();
                break;
            case "S":
                list2.clear();
                break;
            case "M":
                list3.clear();
                break;
            default:
                System.out.println("Выберите значение X, S или M");
                break;
        }
    }

    public List<Integer> merge() {
        List<Integer> list = Stream.concat(list1.stream(), Stream.concat(list2.stream(), list3.stream()))
                .sorted().collect(Collectors.toList());
        list1.clear();
        list2.clear();
        list3.clear();
        return list;
    }
}
