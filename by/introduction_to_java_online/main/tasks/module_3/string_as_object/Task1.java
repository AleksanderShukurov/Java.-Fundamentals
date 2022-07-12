package by.introduction_to_java_online.main.tasks.module_3.string_as_object;

import by.introduction_to_java_online.main.tasks.TrainingIO;

/*
Условие:
Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
 */

public class Task1 {
    TrainingIO trainingIO = new TrainingIO();

    void spaceMaxCalc(String string) {
        trainingIO.printing("Original string is:\n" + string);
        int count = 0;
        int max = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ' ') {
                count++;
                continue;
            }
            if (count > max) {
                max = count;
            }
            count = 0;

        }
        trainingIO.printing("Max number of spaces in a row is: " + max);
    }
}
