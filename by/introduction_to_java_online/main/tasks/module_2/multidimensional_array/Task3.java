package by.introduction_to_java_online.main.tasks.module_2.multidimensional_array;

import by.introduction_to_java_online.main.tasks.TrainingIO;

/*
Условие:
Дана матрица. Вывести k-ую строку и p-й столбец матрицы.
 */

public class Task3 {
    TrainingIO trainingIO = new TrainingIO();

    public void kColumnPrint() {
        ArrayCreate arrayCreate = new ArrayCreate();
        int[][] array = arrayCreate.arrayCreate();
        ArrayPrint arrayPrint = new ArrayPrint();
        trainingIO.printing("\nInitial array: \n");
        arrayPrint.arrayPrint(array);
        trainingIO.printing("\nEnter number of the line k:");
        int k = Integer.parseInt(trainingIO.input());
        trainingIO.printing("\nEnter number of the column p:");
        int p = Integer.parseInt(trainingIO.input());
        trainingIO.printing("\n Line: \n");
        for (int i = 0; i < array.length; i++) {
            trainingIO.printingToTheSameLine(array[k][i] + "  ");
        }
        trainingIO.printing("\n Column:");
        for (int[] ints : array) {
            trainingIO.printing(ints[p] + "  ");
        }
    }

    public void kColumnPrint(int a, int k, int p) {
        ArrayCreate arrayCreate = new ArrayCreate();
        int[][] array = arrayCreate.arrayCreate(a);
        trainingIO.printing("\nInitial array: \n");
        ArrayPrint arrayPrint = new ArrayPrint();
        arrayPrint.arrayPrint(array);
        trainingIO.printing("\n Line: \n");
        for (int i = 0; i < array.length; i++) {
            trainingIO.printingToTheSameLine(array[k][i] + "  ");
        }
        trainingIO.printing("\n Column:");
        for (int[] ints : array) {
            trainingIO.printing(ints[p] + "  ");
        }
    }
}
