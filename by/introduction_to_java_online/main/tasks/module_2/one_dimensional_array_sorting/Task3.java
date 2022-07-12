package by.introduction_to_java_online.main.tasks.module_2.one_dimensional_array_sorting;

/*
Условие:
Дана последовательность чисел a1<=a2<=...<=an. Требуется переставить элементы так, чтобы они были расположены по
убыванию. Для этого в массиве, начиная с первого, выбирается наибольший элемент и ставится на первое место,
а первый - на место наибольшего. Затем, начиная со второго эта процедура повторяется. Написать алгоритм
сортировки выбором.
 */

import by.introduction_to_java_online.main.tasks.TrainingIO;

public class Task3 {
    TrainingIO trainingIO = new TrainingIO();

    public void sortingByChose() {
        ArrayPrint arrayPrint = new ArrayPrint();
        int[] array = new int[]{1, 3, 5, 7, 9, 11};
        trainingIO.printing("Initial array:");
        arrayPrint.arrayPrinting(array);
        int tempVar;
        for (int i = 0; i < array.length; i++) {
            int max = array[i];
            int maxIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > max) {
                    max = array[j];
                    maxIndex = j;
                }
            }
            tempVar = array[i];
            array[i] = max;
            array[maxIndex] = tempVar;
        }
        trainingIO.printing("Sorted array:");
        arrayPrint.arrayPrinting(array);
    }
}
