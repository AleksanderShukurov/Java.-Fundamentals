package by.introduction_to_java_online.main.tasks.module_2.decomposition.task_6;

/*
Условие:
Написать метод (методы), проверяющий, являются ли данные три числа взаимно простыми.
 */

import by.introduction_to_java_online.main.tasks.TrainingIO;


public class Task6 {
    TrainingIO trainingIO = new TrainingIO();

    public void checkingPrimeNumber() {
        int firstNumber = Integer.parseInt(trainingIO.input());
        int secondNumber = Integer.parseInt(trainingIO.input());
        int thirdNumber = Integer.parseInt(trainingIO.input());
        PrimeNumber primeNumber = new PrimeNumber();
        if (primeNumber.checkingPrimeNumber(firstNumber) && primeNumber.checkingPrimeNumber(secondNumber) && primeNumber.checkingPrimeNumber(thirdNumber)) {
            trainingIO.printing("Entered numbers " + firstNumber + ", " + secondNumber + ", " + thirdNumber + " is relatively prime.");
        } else
            trainingIO.printing("Entered numbers " + firstNumber + ", " + secondNumber + ", " + thirdNumber + " is not relatively prime numbers .");
    }

    public void checkingPrimeNumber(int firstNumber, int secondNumber, int thirdNumber) {
        PrimeNumber primeNumber = new PrimeNumber();
        if (primeNumber.checkingPrimeNumber(firstNumber) && primeNumber.checkingPrimeNumber(secondNumber) && primeNumber.checkingPrimeNumber(thirdNumber)) {
            trainingIO.printing("Entered numbers " + firstNumber + ", " + secondNumber + ", " + thirdNumber + " is relatively prime.");
        } else
            trainingIO.printing("Entered numbers " + firstNumber + ", " + secondNumber + ", " + thirdNumber + " is not relatively prime numbers .");
    }
}
