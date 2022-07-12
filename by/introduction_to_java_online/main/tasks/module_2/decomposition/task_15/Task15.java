package by.introduction_to_java_online.main.tasks.module_2.decomposition.task_15;

import by.introduction_to_java_online.main.tasks.TrainingIO;
import by.introduction_to_java_online.main.tasks.module_2.decomposition.NumberOfDigitsInANumber;

import java.util.ArrayList;

/*
Условие:
Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность (например, 1234,
5789(5678)). Для решения задачи использовать декомпозицию.
 */

public class Task15 {
    TrainingIO trainingIO = new TrainingIO();

    public void ascendingSequenceSearch(int n) {
        NumberOfDigitsInANumber numberOfDigitsInANumber = new NumberOfDigitsInANumber();
        ArrayPrint arrayPrint = new ArrayPrint();
        ArrayList<Integer> a = new ArrayList<Integer>();
        GrowCheck growCheck = new GrowCheck();
        NumberToArray numberToArray = new NumberToArray();
        int number = 0;
        if (n > 1) {
            number = (int) (Math.pow(10, n - 1));
        } else if (n == 1) {
            number = 1;
        } else {
            trainingIO.printing("You enter incorrect number");
        }
        while (numberOfDigitsInANumber.getCountsOfDigits(number) == n) {
            if (growCheck.growingChecking(numberToArray.numberToArrayChange(number))) {
                a.add(number);
            }
            number++;
        }
        arrayPrint.arrayPrintingDoubleWithout(a);
    }

    public void ascendingSequenceSearch() {
        NumberOfDigitsInANumber numberOfDigitsInANumber = new NumberOfDigitsInANumber();
        int n = Integer.parseInt(trainingIO.input());
        ArrayPrint arrayPrint = new ArrayPrint();
        ArrayList<Integer> a = new ArrayList<Integer>();
        GrowCheck growCheck = new GrowCheck();
        NumberToArray numberToArray = new NumberToArray();
        int number = 0;
        if (n > 1) {
            number = (int) (Math.pow(10, n - 1));
        } else if (n == 1) {
            number = 1;
        } else {
            trainingIO.printing("You enter incorrect number");
        }
        while (numberOfDigitsInANumber.getCountsOfDigits(number) == n) {
            if (growCheck.growingChecking(numberToArray.numberToArrayChange(number))) {
                a.add(number);
            }
            number++;
        }
        arrayPrint.arrayPrintingDoubleWithout(a);
    }
}
