package by.introduction_to_java_online.main.tasks.module_2.decomposition.task_9;

/*
Условие:
Даны числа X, Y, Z, T - длины сторон четырехугольника. Написать метод(методы) вычисления его площади, если угол между
сторонами длиной X и Y прямой.
 */

import by.introduction_to_java_online.main.tasks.TrainingIO;

public class Task9 {
    TrainingIO trainingIO = new TrainingIO();

    public void startTask9() {
        trainingIO.printing("Area of quadrilateral with a right angle is " + areaOfQuadrilateralCalculation(2.6, 3, 3.6, 1.6));
    }

    public double areaOfQuadrilateralCalculation(double x, double y, double z, double t) {
        AreaOfTriangle areaOfTriangle = new AreaOfTriangle();
        Hypotenuse hypo = new Hypotenuse();
        double hypotenuse = hypo.hypotenuseCalculation(x, y);
        double firstTriangleArea = areaOfTriangle.areaOfTriangleCalculation(x, y, hypotenuse);
        double secondTriangleArea = areaOfTriangle.areaOfTriangleCalculation(z, t, hypotenuse);
        return firstTriangleArea + secondTriangleArea;
    }
}
