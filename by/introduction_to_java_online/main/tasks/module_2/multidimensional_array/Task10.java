package by.introduction_to_java_online.main.tasks.module_2.multidimensional_array;

/*
Найти положительные элементы главной диагонали квадратной матрицы.
 */

import by.introduction_to_java_online.main.tasks.TrainingIO;

public class Task10 {
    TrainingIO trainingIO = new TrainingIO();

    public void positiveNumbersOfMatrixDiagonal() {
        ArrayCreate arrayCreate = new ArrayCreate();
        int[][] array = arrayCreate.arrayCreateFNTP();
        ArrayPrint arrayPrint = new ArrayPrint();
        trainingIO.printing("Initial array: \n");
        arrayPrint.arrayPrint(array);
        trainingIO.printingToTheSameLine("\nElements of the main diagonal of the matrix is positive is : ");
        for (int i = 0; i < array.length; i++) {
            if (array[i][i] > 0) {
                trainingIO.printingToTheSameLine(array[i][i] + " ");
            }
        }
    }

    public void positiveNumbersOfMatrixDiagonal(int arraySize) {
        ArrayCreate arrayCreate = new ArrayCreate();
        int[][] array = arrayCreate.arrayCreateFNTP(arraySize);
        ArrayPrint arrayPrint = new ArrayPrint();
        trainingIO.printing("Initial array: \n");
        arrayPrint.arrayPrint(array);
        trainingIO.printingToTheSameLine("\nElements of the main diagonal of the matrix is positive is : ");
        for (int i = 0; i < array.length; i++) {
            if (array[i][i] > 0) {
                trainingIO.printingToTheSameLine(array[i][i] + " ");
            }
        }
    }
}
