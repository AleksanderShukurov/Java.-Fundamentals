package by.introduction_to_java_online.main.tasks.module_2.one_dimensional_array;

import by.introduction_to_java_online.main.tasks.TrainingIO;

/*
Условие:
Даны действительные числа a1,a2,...,a2n. Найти max(a1+a2n,a2+a2n-1,...,an+an+1).
 */

public class Task7 {
    TrainingIO trainingIO = new TrainingIO();

    void maxDetect() {
        trainingIO.printing("Enter array size. They must be even");
        ArrayCreate arrayCreate1 = new ArrayCreate();
        int[] a = arrayCreate1.arrayCreate(Integer.parseInt(trainingIO.input()));

        assert a != null;
        int max = a[0] + a[a.length - 1];
        for (int i = 0; i < (a.length - 1) / 2; i++) {
            if (max < a[i] + a[a.length - 1 - i]) {
                max = a[i] + a[a.length - 1 - i];
            }
        }
        trainingIO.printing("Maximum number in the array is " + max);
    }

    void maxDetect(int arraySize) {
        ArrayCreate arrayCreate1 = new ArrayCreate();
        int[] a = arrayCreate1.arrayCreate(arraySize);
        assert a != null;
        int max = a[0] + a[a.length - 1];
        for (int i = 0; i < (a.length - 1) / 2; i++) {
            if (max < a[i] + a[a.length - 1 - i]) {
                max = a[i] + a[a.length - 1 - i];
            }
        }
        trainingIO.printing("Maximum number in the array is " + max);
    }
}
