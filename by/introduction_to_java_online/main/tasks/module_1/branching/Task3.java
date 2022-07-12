package by.introduction_to_java_online.main.tasks.module_1.branching;

/*
Даны три точки A(x1,y1), B(x2,y2) и C(x3,y3). Определить, будут ли они расположены на одной прямой.
 */
public class Task3 {
    public boolean threePointOneLineDetection(int x1, int y1, int x2, int y2, int x3, int y3) {
        return (y3 - y1) / (y2 - y1) == (x3 - x1) / (x2 - x1);
    }
}
