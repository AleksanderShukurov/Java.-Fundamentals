package by.introduction_to_java_online.main.tasks.module_2.decomposition;

/*
Метод определяюший количество цифр в числе.
 */
public class NumberOfDigitsInANumber {
    public int getCountsOfDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }
}
