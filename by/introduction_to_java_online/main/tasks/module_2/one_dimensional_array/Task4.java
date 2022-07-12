package by.introduction_to_java_online.main.tasks.module_2.one_dimensional_array;

/*
Условие:
Даны действительные числа a1,a2,...,an. Поменять местами наибольший и наименьший элементы.
 */

import by.introduction_to_java_online.main.tasks.TrainingIO;

public class Task4 {
    TrainingIO trainingIO = new TrainingIO();

    void maxMinChange() {
        ArrayCreate arrayCreate = new ArrayCreate();
        int[] a = arrayCreate.arrayCreate(10);
        trainingIO.printing("Initial array: \n");
        for (int b : a
        ) {
            trainingIO.printingToTheSameLine(b + " ");
        }
        int maxVariable = a[0];
        int maxIndex = 0;
        int minVariable = a[0];
        int minIndex = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > maxVariable) {
                maxIndex = i;
                maxVariable = a[i];
            }
            if (a[i] < minVariable) {
                minIndex = i;
                minVariable = a[i];
            }
        }
        a[minIndex] = maxVariable;
        a[maxIndex] = minVariable;
        trainingIO.printing("");
        trainingIO.printing("Changed array: \n");
        for (int b : a
        ) {
            trainingIO.printingToTheSameLine(b + " ");
        }
    }
}
