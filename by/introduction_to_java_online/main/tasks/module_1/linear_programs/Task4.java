package by.introduction_to_java_online.main.tasks.module_1.linear_programs;

/*
Условие:
Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целых частях). Поменять местами дробную
и целую части числа и вывести полученное значение числа.
 */

import by.introduction_to_java_online.main.tasks.TrainingIO;

public class Task4 {
    TrainingIO trainingIO = new TrainingIO();

    void realNumberChange(double a) {
        double y = (a * 1000) % 1000 + (int) a / 1000.0;
        trainingIO.printing(String.valueOf(y));
    }
}
