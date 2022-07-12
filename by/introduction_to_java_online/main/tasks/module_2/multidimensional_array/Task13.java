package by.introduction_to_java_online.main.tasks.module_2.multidimensional_array;

/*
Условие:
Отсортировать столбцы матрицы по возрастанию и убыванию значений элементов.
 */

import by.introduction_to_java_online.main.tasks.TrainingIO;

public class Task13 {
    TrainingIO trainingIO = new TrainingIO();

    public void sortedColumnOfMatrix() {
        ArrayCreate arrayCreate = new ArrayCreate();
        int[][] array = arrayCreate.arrayCreate();
        ArrayPrint arrayPrint = new ArrayPrint();
        trainingIO.printing("Initial array: \n");
        arrayPrint.arrayPrint(array);
        int var;
        trainingIO.printing("\nMatrix sorted by descending element values: \n");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                for (int k = 0; k < array.length; k++) {
                    if (array[j][i] > array[k][i]) {
                        var = array[j][i];
                        array[j][i] = array[k][i];
                        array[k][i] = var;
                    }
                }
            }
        }
        arrayPrint.arrayPrint(array);
        trainingIO.printing("\nMatrix sorted in ascending order of element values: \n");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                for (int k = 0; k < array.length; k++) {
                    if (array[j][i] < array[k][i]) {
                        var = array[j][i];
                        array[j][i] = array[k][i];
                        array[k][i] = var;
                    }
                }
            }
        }
        arrayPrint.arrayPrint(array);
    }

    public void sortedColumnOfMatrix(int sizeMatrix) {
        ArrayCreate arrayCreate = new ArrayCreate();
        int[][] array = arrayCreate.arrayCreate(sizeMatrix);
        ArrayPrint arrayPrint = new ArrayPrint();
        trainingIO.printing("Initial array: \n");
        arrayPrint.arrayPrint(array);
        int var;
        trainingIO.printing("\nMatrix sorted by descending element values: \n");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                for (int k = 0; k < array.length; k++) {
                    if (array[j][i] > array[k][i]) {
                        var = array[j][i];
                        array[j][i] = array[k][i];
                        array[k][i] = var;
                    }
                }
            }
        }
        arrayPrint.arrayPrint(array);
        trainingIO.printing("\nMatrix sorted in ascending order of element values: \n");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                for (int k = 0; k < array.length; k++) {
                    if (array[j][i] < array[k][i]) {
                        var = array[j][i];
                        array[j][i] = array[k][i];
                        array[k][i] = var;
                    }
                }
            }
        }
        arrayPrint.arrayPrint(array);
    }
}
