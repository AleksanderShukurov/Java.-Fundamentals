package by.introduction_to_java_online.main.tasks.module_2.one_dimensional_array;
/*
Условие:
В массиве цеслых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких чисел несколько, то определить наименьшее из них.
 */

import by.introduction_to_java_online.main.tasks.TrainingIO;

public class Task9 {
    TrainingIO trainingIO = new TrainingIO();

    void oftenValue() {
        ArrayCreate arrayCreate = new ArrayCreate();
        int n = 10;
        int[] a = arrayCreate.arrayCreate(n);
        trainingIO.printing("Initial array: \n");
        for (int d : a
        ) {
            trainingIO.printingToTheSameLine(d + " ");
        }
        System.out.println();
        int maxConst = a[0];
        int indexVar = 0;
        int indexConst = 0;
        int countVar = 0;
        int countConst = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i == j) {
                    continue;
                }
                if (a[i] == a[j]) {
                    countVar++;
                    indexVar = j;
                }
            }
            if (countVar > countConst) {
                indexConst = indexVar;
                maxConst = a[indexConst];
                countConst = countVar;
            } else if (countVar == countConst & a[indexVar] < a[indexConst]) {
                indexConst = indexVar;
                maxConst = a[indexConst];
            }
            countVar = 0;
            indexVar = 0;
        }
        trainingIO.printing("Most occurring number is " + maxConst);
    }
}
