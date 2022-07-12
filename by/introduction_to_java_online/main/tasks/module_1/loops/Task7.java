package by.introduction_to_java_online.main.tasks.module_1.loops;

import by.introduction_to_java_online.main.tasks.TrainingIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Условие:
Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
m и n вводятся с клавиатуры.
 */

public class Task7 {
    TrainingIO trainingIO = new TrainingIO();

    public void integersCheck() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        trainingIO.printing("Enter number n");
        int m = 0;
        try {
            m = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.getStackTrace();
        }
        trainingIO.printing("Enter number m");
        int n = 0;
        try {
            n = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.getStackTrace();
        }
        for (int i = m; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i % j == 0) & (j != 1) & (j != i)) {
                    trainingIO.printing(j + " the divider of " + i);
                }
            }
        }
    }

    void integersCheck(int m, int n) {

        for (int i = m; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i % j == 0) & (j != 1) & (j != i)) {
                    trainingIO.printing(j + " the divider of " + i);
                }
            }
        }
    }
}
