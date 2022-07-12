package by.introduction_to_java_online.main.tasks.module_4.simple_classes_and_objects.task_7;

import by.introduction_to_java_online.main.tasks.TrainingIO;

public class TriangleLogic {
    TrainingIO trainingIO = new TrainingIO();

    public double areaOfTheTriangleCalculation(int a, int b, int c) {
        double halfPerimeter = perimeterOfTheTriangleCalculation(a, b, c) / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c));
    }

    public double perimeterOfTheTriangleCalculation(int a, int b, int c) {
        return a + b + c;
    }

    /*
    Поиск координаты точки пересечения медиан, основан на допущении, что одна из виршин треугольника имеет координаты
    (0,0), и одна из прилегающих сторон треугольника лежит по оси X.

     */
    public void coordinatesOfTheMediansIntersection(int a, int b, int c) {
        double medianC = Math.sqrt((2 * Math.pow(a, 2)) + (2 * Math.pow(b, 2)) - Math.pow(c, 2)) / 2;
        double alfa = Math.toDegrees(Math.acos((Math.pow(medianC, 2) + (Math.pow(b, 2)) - (Math.pow((double) c / 2, 2))) / (2 * medianC * b)));
        double coordinateX = ((2 / 3d) * medianC * Math.cos(Math.toRadians(alfa)));
        double coordinateY = ((2 / 3d) * medianC * Math.cos(Math.toRadians(90 - alfa)));
        trainingIO.printing("Coordinates of the point intersection of the medians XY is: (" + String.format("%.3f", coordinateX) + "; " + String.format("%.3f", coordinateY) + ")");

    }
}
