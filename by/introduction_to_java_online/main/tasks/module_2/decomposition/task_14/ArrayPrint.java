package by.introduction_to_java_online.main.tasks.module_2.decomposition.task_14;

import java.util.ArrayList;

/*
Метод для вывод содержимого массива или списка на консоль.
 */
public class ArrayPrint {
    void arrayPrinting(int[] a) {
        for (int i = 0; i < a.length; i++) {

            System.out.print(a[i] + "  ");
        }
        System.out.println();
    }

    void arrayPrinting(ArrayList<Integer> a) {
        for (int i = 0; i < a.size(); i++) {

            System.out.print(a.get(i) + "  ");
        }
        System.out.println();
    }

    void arrayPrintingDouble(ArrayList<Integer> a) {
        EvenOdd evenOdd = new EvenOdd();
        for (int i = 0; i < a.size(); i++) {
            if (i % 2 == 0) {
                System.out.print("(");
                System.out.print(a.get(i) + "  ");
            }

            if (i % 2 != 0) {
                System.out.print(a.get(i));
                System.out.print(") ");
            }
        }
        System.out.println();
    }

    void arrayPrintingDoubleWithout(ArrayList<Integer> a) {
        EvenOdd evenOdd = new EvenOdd();
        for (int i = 0; i < a.size(); i++) {

            System.out.print(a.get(i) + "  ");
        }
        System.out.println();
    }
}


