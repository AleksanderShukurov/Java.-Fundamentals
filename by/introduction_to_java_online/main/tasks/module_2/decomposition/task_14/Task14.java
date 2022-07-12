package by.introduction_to_java_online.main.tasks.module_2.decomposition.task_14;

import by.introduction_to_java_online.main.tasks.TrainingIO;
import by.introduction_to_java_online.main.tasks.module_2.decomposition.NumberOfDigitsInANumber;

import java.util.ArrayList;

/*
Условие:
Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр, возведенная в степень n,
равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи использовать декомпозицию.
 */

public class Task14 {
    TrainingIO trainingIO = new TrainingIO();

    public void searchForArmstrongNumbers(int k) {
        NumberOfDigitsInANumber numberOfDigitsInANumber = new NumberOfDigitsInANumber();
        ArrayPrint arrayPrint = new ArrayPrint();
        int tempVar = 0;
        ArrayList<Integer> a = new ArrayList<Integer>();
        SumOfDigits sumOfDigits = new SumOfDigits();
        for (int i = 1; i < k; i++) {
            tempVar = numberOfDigitsInANumber.getCountsOfDigits(i);
            if (i == (int) (Math.pow(sumOfDigits.sumOdDigitsCalculation(i), tempVar))) {
                a.add(i);
            }
        }
        arrayPrint.arrayPrintingDoubleWithout(a);
    }

    public void searchForArmstrongNumbers() {
        int k = Integer.parseInt(trainingIO.input());
        NumberOfDigitsInANumber numberOfDigitsInANumber = new NumberOfDigitsInANumber();
        ArrayPrint arrayPrint = new ArrayPrint();
        int tempVar = 0;
        ArrayList<Integer> a = new ArrayList<Integer>();
        SumOfDigits sumOfDigits = new SumOfDigits();
        for (int i = 1; i < k; i++) {
            tempVar = numberOfDigitsInANumber.getCountsOfDigits(i);
            if (i == (int) (Math.pow(sumOfDigits.sumOdDigitsCalculation(i), tempVar))) {
                a.add(i);
            }
        }
        arrayPrint.arrayPrintingDoubleWithout(a);
    }
}
