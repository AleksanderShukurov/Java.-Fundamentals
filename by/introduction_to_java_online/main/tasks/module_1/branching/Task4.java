package by.introduction_to_java_online.main.tasks.module_1.branching;

import by.introduction_to_java_online.main.tasks.TrainingIO;

/*
Заданы размеры A, B прямоугольного отверстия и размеры x,y,z кирпича. Определить, пройдет ли кирпич через отверстие.
 */
public class Task4 {
    TrainingIO trainingIO = new TrainingIO();

    void didHoleEnough(double x, double y, double z, int A, int B) {
        if ((x <= A & y <= B) || (x <= A & z <= B) || (y <= A & x <= B) || (y <= A & z <= B) || (z <= A & x <= B) || (z <= A & y <= B)) {
            trainingIO.printing("Brick is smaller than hole");
        } else {
            trainingIO.printing("Brick is bigger than hole");
        }
    }
}
