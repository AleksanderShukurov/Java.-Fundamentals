package by.introduction_to_java_online.main.tasks.module_2.multidimensional_array;

import by.introduction_to_java_online.main.tasks.TrainingIO;

/*
Сформировать квадратную матрицу порядка n по заданному образцу (n - четное).
                                    1   1   1   ... 1 1 1
                                    2   2   2   ... 2 2 0
                                    3   3   3   ... 3 0 0
                                    .   .   .   ... . . .
                                   n-1  n-1 0   ... 0 0 0
                                    n   0   0   ... 0 0 0
 */

public class Task5 {
    TrainingIO trainingIO = new TrainingIO();

    public void secondSquareMatrix() {
        trainingIO.printing("Enter the order of the matrix, they must be even: ");
        int matrixOrder = Integer.parseInt(trainingIO.input());
        int[][] array = new int[matrixOrder][matrixOrder];
        ArrayPrint arrayPrint = new ArrayPrint();
        int count = array.length;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < count; j++) {
                array[i][j] = i + 1;
            }
            count--;
        }
        trainingIO.printing("Created matrix: ");
        arrayPrint.arrayPrint(array);
    }

    public void secondSquareMatrix(int matrixOrder) {
        int[][] array = new int[matrixOrder][matrixOrder];
        ArrayPrint arrayPrint = new ArrayPrint();
        int count = array.length;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < count; j++) {
                array[i][j] = i + 1;
            }
            count--;
        }
        trainingIO.printing("Created matrix: ");
        arrayPrint.arrayPrint(array);
    }
}
