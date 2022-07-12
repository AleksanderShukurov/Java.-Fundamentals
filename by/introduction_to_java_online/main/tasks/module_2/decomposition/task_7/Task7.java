package by.introduction_to_java_online.main.tasks.module_2.decomposition.task_7;

/*
Условие:
Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
 */

import by.introduction_to_java_online.main.tasks.TrainingIO;

public class Task7 {
    TrainingIO trainingIO = new TrainingIO();

    public void startTask7() {
        trainingIO.printing("Sum of the factorials of the first 9 odd numbers is " + sumOfFactorialsCalculation());
    }

    public long sumOfFactorialsCalculation() {
        int sumOfFactorials = 0;
        Factorial factorial = new Factorial();
        for (int i = 1; i <= 9; i += 2) {
            sumOfFactorials += factorial.factorialCalculation(i);
        }
        return sumOfFactorials;
    }
}
