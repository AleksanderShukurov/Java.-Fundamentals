package by.introduction_to_java_online.main.tasks.module_2.multidimensional_array;

import by.introduction_to_java_online.main.tasks.TrainingIO;

/*
Сформировать квадратную матрицу порядка n по заданному образцу (n - четное).
                                    1   1   1   ... 1  1  1
                                    0   1   1   ... 1  1  0
                                    0   0   1   ... 1  0  0
                                    .   .   .   ... .  .  .
                                    0   0   1   ... 1  0  0
                                    0   1   1   ... 1  1  0
                                    1   1   1   ... 1  1  1
 */

public class Task6 {
    TrainingIO trainingIO = new TrainingIO();

    public void thirdSquareMatrix() {
        trainingIO.printing("Enter the order of the matrix, they must be even: ");
        int matrixOrder = Integer.parseInt(trainingIO.input());
        int[][] array = new int[matrixOrder][matrixOrder];
        ArrayPrint arrayPrint = new ArrayPrint();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i < array.length / 2) {
                    if (j < i || j > array.length - i - 1) {
                        array[i][j] = 0;
                    } else {
                        array[i][j] = 1;
                    }
                } else {
                    array[i][j] = array[array.length - i - 1][j];
                }
            }
        }
        trainingIO.printing("Created matrix: ");
        arrayPrint.arrayPrint(array);
    }

    public void thirdSquareMatrix(int matrixOrder) {
        int[][] array = new int[matrixOrder][matrixOrder];
        ArrayPrint arrayPrint = new ArrayPrint();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i < array.length / 2) {
                    if (j < i || j > array.length - i - 1) {
                        array[i][j] = 0;
                    } else {
                        array[i][j] = 1;
                    }
                } else {
                    array[i][j] = array[array.length - i - 1][j];
                }
            }
        }
        trainingIO.printing("Created matrix: ");
        arrayPrint.arrayPrint(array);
    }
}

