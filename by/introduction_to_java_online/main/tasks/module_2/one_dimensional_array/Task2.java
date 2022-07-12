package by.introduction_to_java_online.main.tasks.module_2.one_dimensional_array;

import by.introduction_to_java_online.main.tasks.TrainingIO;
/*
Условие:
Дана последовательность действительных чисел a1, a2,..., an. Заменить все ее члены, больше данного Z, этим числом. Подсчитать количество замен.
 */

public class Task2 {
    TrainingIO trainingIO = new TrainingIO();

    void arrayChange() {
        trainingIO.printing("Enter Z number ");
        int z = Integer.parseInt(trainingIO.input());
        ArrayCreate arrayCreate1 = new ArrayCreate();
        int[] a = arrayCreate1.arrayCreate(10);
        trainingIO.printing("Initial array: \n");
        for (int integer : a
        ) {
            trainingIO.printingToTheSameLine(integer + " ");
        }
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > z) {
                a[i] = z;
                count++;
            }
        }
        trainingIO.printing("Changed array: \n");
        for (int integer : a
        ) {
            trainingIO.printingToTheSameLine(integer + " ");
        }
        trainingIO.printing("Number of changes is " + count);
    }

    void arrayChange(int z) {
        ArrayCreate arrayCreate1 = new ArrayCreate();
        int[] a = arrayCreate1.arrayCreate(10);
        trainingIO.printing("Initial array: \n");
        for (int integer : a
        ) {
            trainingIO.printingToTheSameLine(integer + " ");
        }
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > z) {
                a[i] = z;
                count++;
            }
        }
        trainingIO.printing("\nChanged array: \n");
        for (int integer : a
        ) {
            trainingIO.printingToTheSameLine(integer + " ");
        }
        trainingIO.printing("\nNumber of changes is " + count);
    }
}
