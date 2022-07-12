package by.introduction_to_java_online.main.tasks.module_2.decomposition.task_16;

import by.introduction_to_java_online.main.tasks.module_2.decomposition.NumberOfDigitsInANumber;

/*
Метод возвращает количество четных цифр в числе.
 */

public class NumberOfEvenDigitsInSum {
    int numberOfEvenDigitsCalculation(int sum) {
        int count = 0;
        int tempVar;
        NumberOfDigitsInANumber numberOfDigitsInANumber = new NumberOfDigitsInANumber();
        for (int i = 0; i <= numberOfDigitsInANumber.getCountsOfDigits(sum); i++) {
            tempVar = sum % 10;
            if (tempVar % 2 == 0) {
                count++;
            }
            sum /= 10;
        }
        return count;
    }
}
