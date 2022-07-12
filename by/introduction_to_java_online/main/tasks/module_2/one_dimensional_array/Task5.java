package by.introduction_to_java_online.main.tasks.module_2.one_dimensional_array;
/*
Условие:
Даны целые числа a1,a2,...,an. Вывести на печать только те числа, для которых ai>i.
 */

import by.introduction_to_java_online.main.tasks.TrainingIO;

public class Task5 {
    TrainingIO trainingIO = new TrainingIO();

    void maxDigitPrint() {
        ArrayCreate arrayCreate = new ArrayCreate();
        int[] a = arrayCreate.arrayCreate(10);
        trainingIO.printingToTheSameLine("Initial array: \n");
        for (int b : a
        ) {
            System.out.print(b + " ");
        }
        trainingIO.printing("\nResults: \n");
        for (int i = 0; i < a.length; i++) {
            if (a[i] > i) {
                trainingIO.printingToTheSameLine(a[i] + " ");
            }
        }
    }
}
