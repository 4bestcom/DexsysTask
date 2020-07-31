package Data;

import java.util.ArrayList;
import java.util.Collections;

public class Data {
    private ArrayList<Integer> list1 = new ArrayList<Integer>();
    private ArrayList<Integer> list2 = new ArrayList<Integer>();
    private ArrayList<Integer> list3 = new ArrayList<Integer>();
    private boolean isAnyMore;


    public boolean isAnyMore() {
        return isAnyMore;
    }

    public ArrayList<Integer> getList1() {
        return list1;
    }

    public ArrayList<Integer> getList2() {
        return list2;
    }

    public ArrayList<Integer> getList3() {
        return list3;
    }

    public void initArray(int[] array) {
        for (int firstNumb : array) {
            if (firstNumb % 3 == 0) {
                list1.add(firstNumb);
            }
            if (firstNumb % 7 == 0) {
                list2.add(firstNumb);
            }
            if (firstNumb % 21 == 0) {
                list3.add(firstNumb);
            }
            else if (firstNumb % 3 != 0 && firstNumb % 7 != 0){
                isAnyMore = true;
            }
        }
        if (list1.size() > 1) {
            Collections.sort(list1);
        }
        if (list2.size() > 1) {
            Collections.sort(list2);
        }
        if (list3.size() > 1) {
            Collections.sort(list3);
        }
    }

    public void print() {
        for (int printNumbList1 : list1) {
            System.out.print(printNumbList1 + " ");
        }
        System.out.println();
        for (int printNumbList2 : list2) {
            System.out.print(printNumbList2 + " ");
        }
        System.out.println();
        for (int printNumbList3 : list3) {
            System.out.print(printNumbList3 + " ");
        }
    }

    public void printType(String value) {
        switch (value) {
            case "X":
                for (int printNumbList1 : list1) {
                    System.out.print(printNumbList1 + " ");
                }
                break;
            case "S":
                for (int printNumbList2 : list2) {
                    System.out.print(printNumbList2 + " ");
                }
                break;
            case "M":
                for (int printNumbList3 : list3) {
                    System.out.print(printNumbList3 + " ");
                }
                break;
            default:
                System.out.println("Выберите значение X, S или M");
                break;
        }
    }

    public void clearType(String value){
        switch (value){
            case "X":
                list1.clear();
                break;
            case "S":
                list2.clear();
                break;
            case  "M":
                list3.clear();
                break;
            default:
                System.out.println("Выберите значение X, S или M");
                break;
        }
    }

    public ArrayList<Integer> merge(){
        ArrayList<Integer> list = new ArrayList<>(list1);
        list.addAll(list2);
        list.addAll(list3);
        list1.clear();
        list2.clear();
        list3.clear();
        Collections.sort(list);
        return list;
    }
}