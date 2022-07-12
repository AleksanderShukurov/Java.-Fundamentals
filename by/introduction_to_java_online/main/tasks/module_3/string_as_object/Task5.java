package by.introduction_to_java_online.main.tasks.module_3.string_as_object;

/*
Условие:
Подсчитать, сколько раз среди символов заданной строки встрчается буква "a".
 */

public class Task5 {
    int howManyA(String string) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 97) {
                count++;
            }
        }
        return count;
    }
}
