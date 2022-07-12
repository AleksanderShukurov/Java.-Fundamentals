package by.introduction_to_java_online.main.tasks.module_2.one_dimensional_array;

import by.introduction_to_java_online.main.tasks.TrainingIO;

/*
Условие:
Дана последовательность действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.
 */

public class Task3 {
    TrainingIO trainingIO = new TrainingIO();

    public void counter() {
        ArrayCreate arrayCreate = new ArrayCreate();
        trainingIO.printing("Enter array size");
        int[] a = arrayCreate.arrayCreateFNTP(Integer.parseInt(trainingIO.input()));
        trainingIO.printing("Initial array: \n");
        for (int integer : a
        ) {
            trainingIO.printingToTheSameLine(integer + " ");
        }
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        assert a != null;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                zeroCount++;
            } else {
                if (a[i] > 0) {
                    positiveCount++;
                } else {
                    negativeCount++;
                }
            }
        }
        trainingIO.printing("Negative number count is " + negativeCount + "." + " Positive number count is " + positiveCount + "." + " Zero number count is " + zeroCount + ".");
    }

    public void counter(int arraySize) {
        ArrayCreate arrayCreate = new ArrayCreate();
        int[] a = arrayCreate.arrayCreateFNTP(arraySize);
        trainingIO.printing("Initial array: \n");
        for (int integer : a
        ) {
            trainingIO.printingToTheSameLine(integer + " ");
        }
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        assert a != null;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                zeroCount++;
            } else {
                if (a[i] > 0) {
                    positiveCount++;
                } else {
                    negativeCount++;
                }
            }
        }
        trainingIO.printing("\nNegative number count is " + negativeCount + "." + " Positive number count is " + positiveCount + "." + " Zero number count is " + zeroCount + ".");
    }
}
