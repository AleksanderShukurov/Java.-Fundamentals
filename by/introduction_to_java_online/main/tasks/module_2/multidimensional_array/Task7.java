package by.introduction_to_java_online.main.tasks.module_2.multidimensional_array;

import by.introduction_to_java_online.main.tasks.TrainingIO;

import static java.lang.Math.pow;
import static java.lang.Math.sin;

/*
Условие:
Сформировать квадратную матрицу порядка N по правилу:
                                                        A[I,J] = sin((I^2-J^2)\N)
и подсчитать количество положительных элементов в ней.
 */

public class Task7 {
    TrainingIO trainingIO = new TrainingIO();

    public void fourSquareMatrix() {
        trainingIO.printing("Enter the order of the matrix");
        int matrixOrder = Integer.parseInt(trainingIO.input());
        double[][] array = new double[matrixOrder][matrixOrder];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = sin(((pow(i, 2)) - pow(j, 2)) / matrixOrder);
                if (array[i][j] > 0) {
                    count++;
                }
            }
        }
        ArrayPrint arrayPrint = new ArrayPrint();
        arrayPrint.arrayPrint(array);
        trainingIO.printing("Number of positive elements in matrix is " + count);
    }

    public void fourSquareMatrix(int matrixOrder) {
        double[][] array = new double[matrixOrder][matrixOrder];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = sin(((pow(i, 2)) - pow(j, 2)) / matrixOrder);
                if (array[i][j] > 0) {
                    count++;
                }
            }
        }
        ArrayPrint arrayPrint = new ArrayPrint();
        arrayPrint.arrayPrint(array);
        trainingIO.printing("Number of positive elements in matrix is " + count);
    }
}
