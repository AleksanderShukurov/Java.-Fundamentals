package by.introduction_to_java_online.main.tasks.module_3.string_as_object;

/*
Условие:
В строке вставить после каждого символа 'a' символ 'b'.
 */

import by.introduction_to_java_online.main.tasks.TrainingIO;

public class Task2 {
    TrainingIO trainingIO = new TrainingIO();

    void symbolBAfterA(String string) {
        StringBuilder stringBuilder = new StringBuilder(string);
        trainingIO.printing("String before transformation:" + string);
        for (int i = 0; i < stringBuilder.length(); i++) {
            if (stringBuilder.charAt(i) == 97) {
                stringBuilder.insert(i + 1, 'b');
            }
        }
        string = stringBuilder.toString();
        trainingIO.printing("String after transformation:" + string);
    }
}
