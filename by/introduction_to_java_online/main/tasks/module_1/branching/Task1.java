package by.introduction_to_java_online.main.tasks.module_1.branching;

/*
Условие:
Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным.
 */

import by.introduction_to_java_online.main.tasks.TrainingIO;

public class Task1 {
    TrainingIO trainingIO = new TrainingIO();

    public void didTriangleExist(int a, int b) {
        if (a + b < 180) {
            if (a == 90 || b == 90 || a + b == 90) {
                trainingIO.printing("Triangle with given angles " + a + " and " + b + "is exist and rectangular");
            } else
                trainingIO.printing("Triangle with given angles " + a + " and " + b + " is exist");
        } else {
            trainingIO.printing("Triangle with given angles " + a + " and " + b + " don't exist");
        }
    }
}
