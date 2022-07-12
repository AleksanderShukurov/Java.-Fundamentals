package by.introduction_to_java_online.main.tasks.module_2.one_dimensional_array;

import by.introduction_to_java_online.main.tasks.TrainingIO;

/*
Условие:
Дана последовательность целых чисел a1,a2,...,an. Образовать новую последовательность выбросив из исходной те члены, которые равны min(a1,a2,...,an).
 */

public class Task8 {
    TrainingIO trainingIO = new TrainingIO();

    void deleteMin() {
        trainingIO.printing("Enter array size");
        ArrayCreate arrayCreate1 = new ArrayCreate();
        int[] a = arrayCreate1.arrayCreate(Integer.parseInt(trainingIO.input()));
        assert a != null;
        int min = a[0];
        trainingIO.printing("Initial array: \n");
        for (int c : a
        ) {
            trainingIO.printingToTheSameLine(c + " ");
        }
        int count = 0;
        for (int i = 1; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        for (int j = 0; j < a.length; j++) {
            if (a[j] == min) {
                {
                    count++;
                }
            }
        }
        int[] b = new int[a.length - count];
        for (int k = 0, z = 0; k < a.length; k++) {
            if (a[k] != min) {
                b[z] = a[k];
                z++;
            }
        }
        trainingIO.printing("Changed array: \n");
        for (int d : b
        ) {
            trainingIO.printingToTheSameLine(d + " ");
        }

    }

    void deleteMin(int arraySize) {
        ArrayCreate arrayCreate1 = new ArrayCreate();
        int[] a = arrayCreate1.arrayCreate(arraySize);
        assert a != null;
        int min = a[0];
        trainingIO.printing("Initial array: \n");
        for (int c : a
        ) {
            trainingIO.printingToTheSameLine(c + " ");
        }
        int count = 0;
        for (int i = 1; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        for (int j = 0; j < a.length; j++) {
            if (a[j] == min) {
                {
                    count++;
                }
            }
        }
        int[] b = new int[a.length - count];
        for (int k = 0, z = 0; k < a.length; k++) {
            if (a[k] != min) {
                b[z] = a[k];
                z++;
            }
        }
        trainingIO.printing("\n Changed array: \n");
        for (int d : b
        ) {
            trainingIO.printingToTheSameLine(d + " ");
        }

    }
}


