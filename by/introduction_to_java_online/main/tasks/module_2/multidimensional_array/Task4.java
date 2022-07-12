package by.introduction_to_java_online.main.tasks.module_2.multidimensional_array;

import by.introduction_to_java_online.main.tasks.TrainingIO;

/*
Сформировать квадратную матрицу порядка n по заданному образцу (n - четное).
                                    1   2   3   ... n
                                    n  n-1  n-2 ... 1
                                    1   2   3   ... n
                                    n  n-1  n-2 ... 1
                                    .   .   .   ... .
                                    n  n-1  n-2 ... 1
 */

public class Task4 {
    TrainingIO trainingIO = new TrainingIO();

    public void firstSquareMatrix() {
        trainingIO.printing("Enter the order of the matrix, they must be even: ");
        int matrixOrder = Integer.parseInt(trainingIO.input());
        int[][] array = new int[matrixOrder][matrixOrder];
        ArrayPrint arrayPrint = new ArrayPrint();
        int count = 1;
        int matrixLength = array.length;
        for (int i = 0; i < array.length; i++) {
            if (!(count % 2 == 0)) {
                for (int j = 0; j < array.length; j++) {
                    array[i][j] = j + 1;
                }
            } else {
                for (int j = 0; j < array.length; j++) {
                    array[i][j] = matrixLength--;
                }
            }
            count++;
            matrixLength = array.length;
        }
        arrayPrint.arrayPrint(array);
    }

    public void firstSquareMatrix(int matrixOrder) {
        int[][] array = new int[matrixOrder][matrixOrder];
        ArrayPrint arrayPrint = new ArrayPrint();
        int count = 1;
        int matrixLength = array.length;
        for (int i = 0; i < array.length; i++) {
            if (!(count % 2 == 0)) {
                for (int j = 0; j < array.length; j++) {
                    array[i][j] = j + 1;
                }
            } else {
                for (int j = 0; j < array.length; j++) {
                    array[i][j] = matrixLength--;
                }
            }
            count++;
            matrixLength = array.length;
        }
        trainingIO.printing("Created matrix: ");
        arrayPrint.arrayPrint(array);
    }
}
