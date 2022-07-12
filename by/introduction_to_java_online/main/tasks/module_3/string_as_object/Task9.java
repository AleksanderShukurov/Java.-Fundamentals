package by.introduction_to_java_online.main.tasks.module_3.string_as_object;

/*
Условие:
Посчитать количество строчных (маленьких) и прописных (больших) букв в веденной строке. Учитывать только
английские буквы.
 */

import by.introduction_to_java_online.main.tasks.TrainingIO;

public class Task9 {
    TrainingIO trainingIO = new TrainingIO();

    void numberOfLettersCalculation(String string) {
        int countOfSmallLetters = 0;
        int countOfBigLetters = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) >= 97 && string.charAt(i) <= 122) {
                countOfSmallLetters++;
            } else if (string.charAt(i) >= 65 && string.charAt(i) <= 90) {
                countOfBigLetters++;
            }
        }
        trainingIO.printing("Number of small litters in the string <" + string + "> is: " + countOfSmallLetters + " number of big letters is: " + countOfBigLetters);
    }
}
