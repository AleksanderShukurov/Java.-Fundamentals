package by.introduction_to_java_online.main.tasks.module_2.decomposition.task_11;

import by.introduction_to_java_online.main.tasks.TrainingIO;
import by.introduction_to_java_online.main.tasks.module_2.decomposition.NumberOfDigitsInANumber;

/*
Условие:
Написать метод (методы), определящий, в каком из двух чисел больше цифр.
 */

public class Task11 {
    TrainingIO trainingIO = new TrainingIO();

    public void lengthOfDigitsComparison() {
        trainingIO.printing("Enter first number >>");
        int firstNumber = Integer.parseInt(trainingIO.input());
        trainingIO.printing("Enter second number >>");
        int secondNumber = Integer.parseInt(trainingIO.input());
        NumberOfDigitsInANumber numberOfDigitsInANumber = new NumberOfDigitsInANumber();
        int firstNumberLength = numberOfDigitsInANumber.getCountsOfDigits(firstNumber);
        int secondNumberLength = numberOfDigitsInANumber.getCountsOfDigits(secondNumber);

        if (firstNumberLength > secondNumberLength) {
            trainingIO.printing("The length of the first number is greater than the second");
        }

        if (firstNumberLength < secondNumberLength) {
            trainingIO.printing("The length of the second number is greater than the first");
        }
        if (firstNumberLength == secondNumberLength) {
            trainingIO.printing("The length of the first number and the second are equal");
        }

    }

    public void lengthOfDigitsComparison(int firstNumber, int secondNumber) {
        NumberOfDigitsInANumber numberOfDigitsInANumber = new NumberOfDigitsInANumber();
        int firstNumberLength = numberOfDigitsInANumber.getCountsOfDigits(firstNumber);
        int secondNumberLength = numberOfDigitsInANumber.getCountsOfDigits(secondNumber);

        if (firstNumberLength > secondNumberLength) {
            trainingIO.printing("The length of the first number is greater than the second");
        }

        if (firstNumberLength < secondNumberLength) {
            trainingIO.printing("The length of the second number is greater than the first");
        }
        if (firstNumberLength == secondNumberLength) {
            trainingIO.printing("The length of the first number and the second are equal");
        }

    }
}


