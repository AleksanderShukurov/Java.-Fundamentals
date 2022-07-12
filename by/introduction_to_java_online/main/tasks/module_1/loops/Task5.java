package by.introduction_to_java_online.main.tasks.module_1.loops;

import by.introduction_to_java_online.main.tasks.TrainingIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Условие:
Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен заданному е.
Общий член ряда имеет вид:
an=(1/2^n)+(1/3^n);
 */

public class Task5 {
    TrainingIO trainingIO = new TrainingIO();

    public void numberSeries() {
        trainingIO.printing("Enter some number E");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double e = 0;
        try {
            e = Double.parseDouble(reader.readLine());
        } catch (IOException b) {
            b.printStackTrace();
        }

        int[] a = new int[]{1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27};
        double sum = 0;
        for (int j : a) {
            double sum1 = (1 / Math.pow(2, j)) + (1 / Math.pow(3, j));
            if (e < Math.abs(sum1)) {
                sum += sum1;
            }
            ;
        }
        trainingIO.printing(String.valueOf(sum));
    }

    void numberSeries(double e) {
        int[] a = new int[]{1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27};
        double sum = 0;
        for (int j : a) {
            double sum1 = (1 / Math.pow(2, j)) + (1 / Math.pow(3, j));
            if (e < Math.abs(sum1)) {
                sum += sum1;
            }
            ;
        }
        trainingIO.printing(String.valueOf(sum));
    }
}
