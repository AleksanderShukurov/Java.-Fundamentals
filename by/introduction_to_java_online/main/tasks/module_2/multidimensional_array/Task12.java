package by.introduction_to_java_online.main.tasks.module_2.multidimensional_array;

/*
Условие:
Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
 */

import by.introduction_to_java_online.main.tasks.TrainingIO;

public class Task12 {
    TrainingIO trainingIO = new TrainingIO();

    public void sortedMatrix() {
        ArrayCreate arrayCreate = new ArrayCreate();
        int[][] array = arrayCreate.arrayCreate();
        trainingIO.printing("Initial array: ");
        ArrayPrint arrayPrint = new ArrayPrint();
        arrayPrint.arrayPrint(array);
        int var;
        trainingIO.printing("Matrix sorted by descending element values: \n");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                for (int k = 0; k < array.length; k++) {
                    if (array[i][j] > array[i][k]) {
                        var = array[i][j];
                        array[i][j] = array[i][k];
                        array[i][k] = var;
                    }
                }
            }
        }
        arrayPrint.arrayPrint(array);
        trainingIO.printing("Matrix sorted in ascending order of element values: \n");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                for (int k = 0; k < array.length; k++) {
                    if (array[i][j] < array[i][k]) {
                        var = array[i][j];
                        array[i][j] = array[i][k];
                        array[i][k] = var;
                    }
                }
            }
        }
        arrayPrint.arrayPrint(array);
    }

    public void sortedMatrix(int matrixSize) {
        ArrayCreate arrayCreate = new ArrayCreate();
        int[][] array = arrayCreate.arrayCreate(matrixSize);
        ArrayPrint arrayPrint = new ArrayPrint();
        trainingIO.printing("Initial array: \n");
        arrayPrint.arrayPrint(array);
        int var;
        trainingIO.printing("Matrix sorted by descending element values: \n");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                for (int k = 0; k < array.length; k++) {
                    if (array[i][j] > array[i][k]) {
                        var = array[i][j];
                        array[i][j] = array[i][k];
                        array[i][k] = var;
                    }
                }
            }
        }
        arrayPrint.arrayPrint(array);
        trainingIO.printing("Matrix sorted in ascending order of element values: \n");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                for (int k = 0; k < array.length; k++) {
                    if (array[i][j] < array[i][k]) {
                        var = array[i][j];
                        array[i][j] = array[i][k];
                        array[i][k] = var;
                    }
                }
            }
        }
        arrayPrint.arrayPrint(array);
    }
}
