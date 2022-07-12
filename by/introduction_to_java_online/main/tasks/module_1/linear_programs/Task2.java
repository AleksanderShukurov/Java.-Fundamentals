package by.introduction_to_java_online.main.tasks.module_1.linear_programs;

import by.introduction_to_java_online.main.tasks.TrainingIO;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/*
Условие:
Вычислить значение выражения по формуле (все переменные принимают действительные значения):
(b+sqrt(b^2+4ac)/(2a))-((a^3)*c+b^-2))
 */

public class Task2 {
    TrainingIO trainingIO = new TrainingIO();

    void expressionCalc(double a, double b, double c) {
        trainingIO.printing(String.valueOf(((b + sqrt(pow(b, 2) + 4 * a * c)) / (2 * a)) - (pow(a, 3) * c) + (pow(b, -2))));
    }
}
