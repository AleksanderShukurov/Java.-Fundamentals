package by.introduction_to_java_online.main.tasks.module_1.branching;

import by.introduction_to_java_online.main.tasks.TrainingIO;

import static java.lang.Math.pow;

/*
Условие:
Вычислить значение функции:
F(x)={(x^2) - 3x +9, если x<=3;
F(x)={1/((x^3)+6), если x>3;
 */

public class Task5 {
    TrainingIO trainingIO = new TrainingIO();

    void functionCalculation(int x) {
        if (x <= 3) {
            trainingIO.printing(String.valueOf(pow(x, 2) - 3 * x + 9));
        } else {
            trainingIO.printing(String.valueOf(1 / (pow(x, 3) + 6)));
        }
    }
}
