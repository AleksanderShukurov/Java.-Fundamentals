package by.introduction_to_java_online.main.tasks.module_4.simple_classes_and_objects.task_7;

/*
Условие:
Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления площади, периметра
и точки пересечения медиан.
 */

import by.introduction_to_java_online.main.tasks.TrainingIO;

public class Triangle {
    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle() {
        this.sideA = 1;
        this.sideB = 1;
        this.sideC = 1;
    }

    TrainingIO trainingIO = new TrainingIO();

    public Triangle(int sideA, int sideB, int sideC) {
        if (sideA >= sideB + sideC || sideB >= sideA + sideC || sideC >= sideB + sideA) {
            trainingIO.printing("This triangle cannot be create!");
        } else {

            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
        }
    }

    public int getSideA() {
        return sideA;
    }


    public int getSideB() {
        return sideB;
    }


    public int getSideC() {
        return sideC;
    }


}
