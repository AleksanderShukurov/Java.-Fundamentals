package by.introduction_to_java_online.main.tasks.module_1.linear_programs;

import by.introduction_to_java_online.main.tasks.TrainingIO;

import static java.lang.Math.*;

/*
Условие:
Вычислить значение выражения по формуле (все переменные принимают действительные значения):
((sinx+cosy)/(cosx-siny))*tgxy;
 */

public class Task3 {
    TrainingIO trainingIO = new TrainingIO();

    void expressionCalcSinCos(double x, double y) {
        double value;
        value = ((sin(x) + cos(y)) / (cos(x) - sin(y))) * (tan(x) * tan(y));
        String result = String.format("%.3f", value);
        trainingIO.printing(result);
    }
}
