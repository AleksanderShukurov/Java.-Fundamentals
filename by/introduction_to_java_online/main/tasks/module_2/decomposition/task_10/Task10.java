package by.introduction_to_java_online.main.tasks.module_2.decomposition.task_10;

import by.introduction_to_java_online.main.tasks.TrainingIO;
import by.introduction_to_java_online.main.tasks.module_2.decomposition.NumberOfDigitsInANumber;

/*
Условие:
Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого являются цифры числа N.
 */

public class Task10 {
    TrainingIO trainingIO = new TrainingIO();

    public int[] formingAnArrayOfDigitsFromANumber() {
        trainingIO.printing("Enter natural number N >>");
        int n = Integer.parseInt(trainingIO.input());
        NumberOfDigitsInANumber numberOfDigitsInANumber = new NumberOfDigitsInANumber();
        int numberOfDigits = numberOfDigitsInANumber.getCountsOfDigits(n);
        int[] array = new int[numberOfDigits];
        for (int i = array.length - 1; i >= 0; i--) {
            array[i] = n % 10;
            n /= 10;
        }
        return array;
    }

    public int[] formingAnArrayOfDigitsFromANumber(int n) {
        NumberOfDigitsInANumber numberOfDigitsInANumber = new NumberOfDigitsInANumber();
        int numberOfDigits = numberOfDigitsInANumber.getCountsOfDigits(n);
        int[] array = new int[numberOfDigits];
        for (int i = array.length - 1; i >= 0; i--) {
            array[i] = n % 10;
            n /= 10;
        }
        return array;
    }
}
