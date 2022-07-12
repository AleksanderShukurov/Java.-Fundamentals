package by.introduction_to_java_online.main.tasks.module_1.loops;

/*
Условие:
Вычислить значение функции на отрезке [a,b]  с шагом h^
y = {x, если x>2;
y = [-x, x<=2;
 */

import by.introduction_to_java_online.main.tasks.TrainingIO;

public class Task2 {
    TrainingIO trainingIO = new TrainingIO();

    void sectionStepCalc(int a, int b, int h) {
        for (int i = a; i <= b; i += h) {
            if (i > 2) {
                trainingIO.printing(String.valueOf(i));
            } else {
                trainingIO.printing(String.valueOf(-i));
            }
        }
    }
}
