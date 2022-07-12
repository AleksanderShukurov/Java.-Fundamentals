package by.introduction_to_java_online.main.tasks.module_1.loops;

import by.introduction_to_java_online.main.tasks.TrainingIO;

/*
Условие:
Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
 */

public class Task8 {
    TrainingIO trainingIO = new TrainingIO();

    public void numberIn() {
        trainingIO.printing("Enter first number");
        int m = Integer.parseInt(trainingIO.input());
        trainingIO.printing("Enter second number");
        int n = Integer.parseInt(trainingIO.input());
        int var;
        trainingIO.printing("Digits in number " + m + ":");
        var = m;
        int i = 0;
        int[] arrayOfDigitsOne = new int[String.valueOf(Math.abs(m)).length()];
        int[] arrayOfDigitsTwo = new int[String.valueOf(Math.abs(n)).length()];
        do {
            arrayOfDigitsOne[i] = var % 10;
            var = var / 10;
            i++;
        }
        while (var > 0);
        for (int j = arrayOfDigitsOne.length - 1, k = 1; j >= 0; j--, k++) {
            trainingIO.printing(k + " is " + arrayOfDigitsOne[j] + " ;");
        }
        i = 0;
        trainingIO.printing("\nDigits in number " + n + ":");
        var = n;
        do {
            arrayOfDigitsTwo[i] = var % 10;
            var = var / 10;
            i++;
        }
        while (var > 0);
        for (int j = arrayOfDigitsTwo.length - 1, k = 1; j >= 0; j--, k++) {
            trainingIO.printing(k + " is " + arrayOfDigitsTwo[j] + " ;");
        }
    }

    void numberIn(int m, int n) {
        int var;
        trainingIO.printing("Digits in number " + m + ":");
        var = m;
        int i = 0;
        int[] arrayOfDigitsOne = new int[String.valueOf(Math.abs(m)).length()];
        int[] arrayOfDigitsTwo = new int[String.valueOf(Math.abs(n)).length()];
        do {
            arrayOfDigitsOne[i] = var % 10;
            var = var / 10;
            i++;
        }
        while (var > 0);
        for (int j = arrayOfDigitsOne.length - 1, k = 1; j >= 0; j--, k++) {
            trainingIO.printing(k + " is " + arrayOfDigitsOne[j] + " ;");
        }
        i = 0;
        trainingIO.printing("\nDigits in number " + n + ":");
        var = n;
        do {
            arrayOfDigitsTwo[i] = var % 10;
            var = var / 10;
            i++;
        }
        while (var > 0);
        for (int j = arrayOfDigitsTwo.length - 1, k = 1; j >= 0; j--, k++) {
            trainingIO.printing(k + " is " + arrayOfDigitsTwo[j] + " ;");
        }
    }
}

