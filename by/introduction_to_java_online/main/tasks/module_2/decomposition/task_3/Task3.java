package by.introduction_to_java_online.main.tasks.module_2.decomposition.task_3;

/*
Условие:
Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника.
 */

import by.introduction_to_java_online.main.tasks.TrainingIO;

public class Task3 {
    TrainingIO trainingIO = new TrainingIO();

    public void startTask3() {
        trainingIO.printing("Square of hexagon with length of side 12 is " + hexagonAreaFound(12));
    }

    public double hexagonAreaFound(int a) {
        AreaOfTriangle areaOfTriangle = new AreaOfTriangle();
        double triangleSquare = areaOfTriangle.areaOfRightTriangleCalculation(a);
        return 6 * triangleSquare;
    }
}
