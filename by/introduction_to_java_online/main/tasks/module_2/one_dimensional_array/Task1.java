package by.introduction_to_java_online.main.tasks.module_2.one_dimensional_array;

import by.introduction_to_java_online.main.tasks.TrainingIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Условие:
В массив A[N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному K.
 */

public class Task1 {
    TrainingIO trainingIO = new TrainingIO();

    void array() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        trainingIO.printing("Enter K number ");
        int K = 0;
        try {
            K = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.getStackTrace();
        }
        ArrayCreate arrayCreate1 = new ArrayCreate();
        trainingIO.printing("Enter array size");
        int[] a = null;
        try {
            a = arrayCreate1.arrayCreate(Integer.parseInt(reader.readLine()));
        } catch (IOException e) {
            e.getStackTrace();
        }
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % K == 0) {
                sum += a[i];
            }
        }
        trainingIO.printing("Sum of the elements is " + sum);
    }

    void array(int K, int arraySize) {
        ArrayCreate arrayCreate1 = new ArrayCreate();
        int[] a = arrayCreate1.arrayCreate(arraySize);
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % K == 0) {
                sum += a[i];
            }
        }
        trainingIO.printing("Sum of the elements is " + sum);
    }
}
