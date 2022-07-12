package by.introduction_to_java_online.main.tasks.module_1.loops;

import by.introduction_to_java_online.main.tasks.TrainingIO;

/*
Условие:
Напишите программу, где пользователь вводит любое целое число. А программа суммирует все числа от 1 до введенного
пользователем числа.
 */

public class Task1 {
    TrainingIO trainingIO = new TrainingIO();

    void addCalc() {
        trainingIO.printing("Enter any positive integer number.");
        int a = Integer.parseInt(trainingIO.input());
        int sum = 0;
        for (int i = 0; i <= a; i++) {
            sum += i;
        }
        trainingIO.printing(String.valueOf(sum));
    }

    void addCalc(int a) {
        int sum = 0;
        for (int i = 0; i <= a; i++) {
            sum += i;
        }
        trainingIO.printing(String.valueOf(sum));
    }
}
