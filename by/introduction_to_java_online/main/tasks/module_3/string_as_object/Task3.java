package by.introduction_to_java_online.main.tasks.module_3.string_as_object;

/*
Условие:
Проверить, является ли заданное слово палиндромом.
 */

public class Task3 {
    boolean palindromeChecking(String string) {
        StringBuilder stringBuilder = new StringBuilder(string);
        String reverse = stringBuilder.reverse().toString();
        return string.equals(reverse);
    }
}
