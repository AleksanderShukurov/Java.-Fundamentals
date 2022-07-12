package by.introduction_to_java_online.main.tasks.module_3.string_as_array_of_symbols;

import by.introduction_to_java_online.main.tasks.TrainingIO;

/*
Условие:
В строке найти количество цифр.
 */

public class Task3 {
    TrainingIO trainingIO = new TrainingIO();

    void numberOfDigitsInString(String string) {
        char[] charString = string.toCharArray();
        int count = 0;
        for (char c : charString) {
            if (c >= 48 && c <= 57) {
                count++;
            }
        }
        trainingIO.printing("\nIn the string <" + string + "> number of digits is " + count);
    }
}
