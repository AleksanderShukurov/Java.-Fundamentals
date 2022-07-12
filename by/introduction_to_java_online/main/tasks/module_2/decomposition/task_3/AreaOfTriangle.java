package by.introduction_to_java_online.main.tasks.module_2.decomposition.task_3;

/*
Методы для вычисления площади треугольника.
 */
public class AreaOfTriangle {
    double areaOfTriangleCalculation(double a, double b, double c) {
        PerimeterOfTriangle perimeterOfTriangle = new PerimeterOfTriangle();
        double perimeter = perimeterOfTriangle.perimeterOfTriangleCalculation(a, b, c);
        double area = Math.sqrt(perimeter * (perimeter - a) * (perimeter - b) * (perimeter - c));
        return area;
    }

    double areaOfRightTriangleCalculation(double a) {
        double area = ((Math.pow(a, 2) * Math.sqrt(3)) / 4);
        return area;
    }
}
