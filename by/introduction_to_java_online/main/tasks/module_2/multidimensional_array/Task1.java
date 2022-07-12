package by.introduction_to_java_online.main.tasks.module_2.multidimensional_array;

/*
Условие:
Дана матрица. Вывести на экран все нечетиные столбцы, у которых первый элемент больше последнего.
 */

import by.introduction_to_java_online.main.tasks.TrainingIO;

public class Task1 {
    TrainingIO trainingIO = new TrainingIO();

    void oddBiggerPrint() {
        ArrayCreate arrayCreate = new ArrayCreate();
        int[][] array = arrayCreate.arrayCreate();
        int count = 1;
        ArrayPrint arrayPrint = new ArrayPrint();
        trainingIO.printing("Printing initial array:");
        arrayPrint.arrayPrint(array);
        for (int i = 0; i < array.length; i++) {
            if (!(count % 2 == 0)) {
                trainingIO.printing("");
                for (int j = 0; j < array.length; j++) {
                    if (array[0][i] > array[array.length - 1][i]) {
                        trainingIO.printing(array[j][i] + " ");
                    } else break;
                }
            }
            count++;
        }
    }

    void oddBiggerPrint(int a) {
        ArrayCreate arrayCreate = new ArrayCreate();
        int[][] array = arrayCreate.arrayCreate(a);
        int count = 1;
        int printingCount = 0;
        ArrayPrint arrayPrint = new ArrayPrint();
        trainingIO.printing("Printing initial array:");
        arrayPrint.arrayPrint(array);
        for (int i = 0; i < array.length; i++) {
            if (!(count % 2 == 0)) {
                trainingIO.printing("");
                for (int j = 0; j < array.length; j++) {
                    if (array[0][i] > array[array.length - 1][i]) {
                        trainingIO.printing(array[j][i] + " ");
                        printingCount++;
                    } else break;
                }
            }
            count++;
        }
        if (printingCount == 0) {
            trainingIO.printing("No one column find!");
        }
    }
}
