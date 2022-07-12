package by.introduction_to_java_online.main.tasks.module_2.decomposition.task_16;

/*
Условие:
Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры. Определить также,
сколько четных цифр в найденной суммме. Для решения задачи использовать декомпозицию.
 */

import by.introduction_to_java_online.main.tasks.TrainingIO;

public class Task16 {
    TrainingIO trainingIO = new TrainingIO();

    public void SumOfEvenCalculation() {
        NumberToArray numberToArray = new NumberToArray();
        OddCheck oddCheck = new OddCheck();
        SumOfElement sumOfElement = new SumOfElement();
        NumberOfEvenDigitsInSum numberOfEvenDigitsInSum = new NumberOfEvenDigitsInSum();
        int sum;
        int n = Integer.parseInt(trainingIO.input());
        int[] a = numberToArray.numberToArrayChange(n);
        if (oddCheck.checkingOddNumber(a)) {
            sum = sumOfElement.sumCalculation(a);
            trainingIO.printing("Sum of numbers containing only odd digits is " + sum);
            trainingIO.printing("Number of even digits in the sum is " + numberOfEvenDigitsInSum.numberOfEvenDigitsCalculation(sum));
        } else {
            trainingIO.printing("Number contains even digits.");
        }

    }

    public void SumOfEvenCalculation(int n) {
        NumberToArray numberToArray = new NumberToArray();
        OddCheck oddCheck = new OddCheck();
        SumOfElement sumOfElement = new SumOfElement();
        NumberOfEvenDigitsInSum numberOfEvenDigitsInSum = new NumberOfEvenDigitsInSum();
        int sum;
        int[] a = numberToArray.numberToArrayChange(n);
        if (oddCheck.checkingOddNumber(a)) {
            sum = sumOfElement.sumCalculation(a);
            trainingIO.printing("Sum of numbers containing only odd digits is " + sum);
            trainingIO.printing("Number of even digits in the sum is " + numberOfEvenDigitsInSum.numberOfEvenDigitsCalculation(sum));
        } else {
            trainingIO.printing("Number contains even digits.");
        }

    }
}
