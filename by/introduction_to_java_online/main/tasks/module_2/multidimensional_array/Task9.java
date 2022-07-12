package by.introduction_to_java_online.main.tasks.module_2.multidimensional_array;

/*
Условие:
Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой столбец
ссодержит максимальную сумму.
 */

import by.introduction_to_java_online.main.tasks.TrainingIO;

public class Task9 {
    TrainingIO trainingIO = new TrainingIO();

    public void maxColumnSum() {
        ArrayCreate arrayCreate = new ArrayCreate();
        ArrayPrint arrayPrint = new ArrayPrint();
        int[][] array = arrayCreate.arrayCreate();
        trainingIO.printing("Initial array: \n");
        arrayPrint.arrayPrint(array);
        int sumConst = 0;
        int sumVar = 0;
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            for (int[] ints : array) {
                sumVar += ints[i];
            }
            if (sumVar > sumConst) {
                sumConst = sumVar;
                maxIndex = i;
            }
            sumVar = 0;
        }
        trainingIO.printing("\nColumn number " + maxIndex + " have a greater sum");
    }

    public void maxColumnSum(int arraySize) {
        ArrayCreate arrayCreate = new ArrayCreate();
        ArrayPrint arrayPrint = new ArrayPrint();
        int[][] array = arrayCreate.arrayCreate(arraySize);
        trainingIO.printing("Initial array: \n");
        arrayPrint.arrayPrint(array);
        int sumConst = 0;
        int sumVar = 0;
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            for (int[] ints : array) {
                sumVar += ints[i];
            }
            if (sumVar > sumConst) {
                sumConst = sumVar;
                maxIndex = i;
            }
            sumVar = 0;
        }
        trainingIO.printing("\nColumn number " + maxIndex + " have a greater sum");
    }
}
