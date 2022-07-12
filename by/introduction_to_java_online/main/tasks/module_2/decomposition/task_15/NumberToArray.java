package by.introduction_to_java_online.main.tasks.module_2.decomposition.task_15;

import by.introduction_to_java_online.main.tasks.module_2.decomposition.NumberOfDigitsInANumber;

/*
Метод для преобразования числа в массив цифр.
 */

public class NumberToArray {
    int[] numberToArrayChange(int a) {
        NumberOfDigitsInANumber numberOfDigitsInANumber = new NumberOfDigitsInANumber();
        int[] array = new int[numberOfDigitsInANumber.getCountsOfDigits(a)];
        for (int i = numberOfDigitsInANumber.getCountsOfDigits(a) - 1; i >= 0; i--) {
            array[i] = a % 10;
            a /= 10;
        }
        return array;
    }
}
