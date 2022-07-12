package by.introduction_to_java_online.main.tasks.module_2.multidimensional_array;

/*
Условие:
Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
 */

import by.introduction_to_java_online.main.tasks.TrainingIO;

public class Task15 {
    TrainingIO trainingIO = new TrainingIO();

    public void maxElementChanging() {
        ArrayCreate arrayCreate = new ArrayCreate();
        int[][] array = arrayCreate.arrayCreate();
        ArrayPrint arrayPrint = new ArrayPrint();
        trainingIO.printing("Initial array: \n");
        arrayPrint.arrayPrint(array);
        trainingIO.printing("");
        int maxElem = array[0][0];
        for (int[] ints : array) {
            for (int j = 0; j < array.length; j++) {
                if (ints[j] > maxElem) {
                    maxElem = ints[j];
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (j % 2 != 0) {
                    array[i][j] = maxElem;
                }
            }
        }
        trainingIO.printing("Changed array: \n");
        arrayPrint.arrayPrint(array);
    }

    public void maxElementChanging(int matrixSize) {
        ArrayCreate arrayCreate = new ArrayCreate();
        int[][] array = arrayCreate.arrayCreate(matrixSize);
        ArrayPrint arrayPrint = new ArrayPrint();
        trainingIO.printing("Initial array: \n");
        arrayPrint.arrayPrint(array);
        trainingIO.printing("");
        int maxElem = array[0][0];
        for (int[] ints : array) {
            for (int j = 0; j < array.length; j++) {
                if (ints[j] > maxElem) {
                    maxElem = ints[j];
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (j % 2 != 0) {
                    array[i][j] = maxElem;
                }
            }
        }
        trainingIO.printing("Changed array: \n");
        arrayPrint.arrayPrint(array);
    }
}
