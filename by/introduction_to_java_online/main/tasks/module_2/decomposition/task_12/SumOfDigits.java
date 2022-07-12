package by.introduction_to_java_online.main.tasks.module_2.decomposition.task_12;

import by.introduction_to_java_online.main.tasks.module_2.decomposition.NumberOfDigitsInANumber;

/*
Метод для определения суммы цифр в числе.
 */
public class SumOfDigits {
    int sumOdDigitsCalculation(int a) {
        NumberOfDigitsInANumber numberOfDigitsInANumber = new NumberOfDigitsInANumber();
        int sum = 0;
        int var;
        for (int i = 0; i <= numberOfDigitsInANumber.getCountsOfDigits(a) + 1; i++) {
            var = a % 10;
            sum += var;
            a /= 10;
        }
        return sum;
    }
}
