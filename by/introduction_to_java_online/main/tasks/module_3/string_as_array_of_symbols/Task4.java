package by.introduction_to_java_online.main.tasks.module_3.string_as_array_of_symbols;

import by.introduction_to_java_online.main.tasks.TrainingIO;

/*
Условие:
В строке найти количество цифр.
 */

public class Task4 {
    TrainingIO trainingIO = new TrainingIO();

    void numberInStringDetection(String string) {
        char[] charString = string.toCharArray();
        int count = 0;
        for (int i = 0; i < charString.length - 1; i++) {
            if (charString[i] >= 48 && charString[i] <= 57 && charString[i + 1] >= 48 && charString[i + 1] <= 57) {
                count++;
                for (int j = i + 2; j < charString.length; j++) {
                    if (charString[j] >= 48 && charString[j] <= 57) {
                        i++;
                    } else break;
                }
            }

        }
        trainingIO.printing("\nIn the string <" + string + "> amount of numbers is " + count);
    }
}

