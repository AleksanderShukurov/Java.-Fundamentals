package by.introduction_to_java_online.main.tasks.module_2.multidimensional_array;

import by.introduction_to_java_online.main.tasks.TrainingIO;

/*
Условие:
Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
 */
public class Task2 {
    TrainingIO trainingIO = new TrainingIO();

    void diagonalPrint() {
        ArrayCreate arrayCreate = new ArrayCreate();
        int[][] array = arrayCreate.arrayCreate();
        ArrayPrint arrayPrint = new ArrayPrint();
        trainingIO.printing("\nInitial array: \n");
        arrayPrint.arrayPrint(array);
        trainingIO.printing("\n Diagonal elements of the array: \n");
        for (int i = 0; i < array.length; i++) {
            trainingIO.printingToTheSameLine(array[i][i] + " ");
        }
    }

    void diagonalPrint(int a) {
        ArrayCreate arrayCreate = new ArrayCreate();
        int[][] array = arrayCreate.arrayCreate(a);
        ArrayPrint arrayPrint = new ArrayPrint();
        trainingIO.printing("\nInitial array: \n");
        arrayPrint.arrayPrint(array);
        trainingIO.printing("\n Diagonal elements of the array: \n");

        for (int i = 0; i < array.length; i++) {
            trainingIO.printingToTheSameLine(array[i][i] + " ");
        }
    }
}
