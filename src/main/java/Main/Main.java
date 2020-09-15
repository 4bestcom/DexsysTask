package Main;

import Data.Data;


public class Main {


    public static void main(String[] args) {
        Data data = new Data();
        if (args[0].equals("init") && args[1].equals("array")) {
            int[] tempArray = new int[args.length - 2];
            for (int i = 0; i < args.length - 2; i++) {
                tempArray[i] = Integer.parseInt(args[i + 2]);
            }
            data.initArray(tempArray);
        } else if (args[0].equals("print") && args.length == 2) {
            data.printType(args[1]);
        } else if (args[0].equals("print")) {
            data.print();
        } else if (args[0].equals("anyMore")) {
            System.out.println(data.isAnyMore());
        } else if (args[0].equals("clear")) {
            data.clearType(args[1]);
        } else if (args[0].equals("merge")) {
            for (int a : data.merge()) {
                System.out.print(a + " ");
            }
        } else if (args[0].equals("help")) {
            System.out.println("init array - инициализация списков набором значений array");
            System.out.println("print - печать всех списков");
            System.out.println("print type - печать конкретного списка, где type принимает значения X,S,M");
            System.out.println("anyMore - выводит на экран были ли значения не вошедшие ни в один список," +
                    " возможные значения true, false");
            System.out.println("clear type - чистка списка , где type принимает значения X,S,M");
            System.out.println("merge - слить все списки в один вывести на экран и очистить все списки");
            System.out.println("help - вывод справки по командам");
        }
//срочное исправление бага в ветке hotfix
        //срочное исправление бага в ветке hotfix метода add
    }
}

