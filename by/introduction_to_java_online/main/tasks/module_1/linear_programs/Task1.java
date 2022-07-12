package by.introduction_to_java_online.main.tasks.module_1.linear_programs;

/*
Условие:
Найти значение функции: z = ((a-3)*b/2)+c.
 */

import by.introduction_to_java_online.main.tasks.TrainingIO;

public class Task1 {
    TrainingIO trainingIO = new TrainingIO();

    void funCalc(double a, double b, double c) {
        trainingIO.printing(String.valueOf((double) ((a - 3) * (b / 2) + c)));
    }
}
