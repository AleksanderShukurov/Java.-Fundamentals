package by.introduction_to_java_online.main.tasks.module_1.loops;

/*
Вывести на экран соответствий между символами и их численными обазначениями в памяти компьютера.
 */

import by.introduction_to_java_online.main.tasks.TrainingIO;

public class Task6 {
    TrainingIO trainingIO = new TrainingIO();

    void aSCII() {
        for (byte i = 33; i < 127; i++) {
            trainingIO.printing("Number's " + i + " value of ASCII symbol: " + (char) i);
        }
    }
}
