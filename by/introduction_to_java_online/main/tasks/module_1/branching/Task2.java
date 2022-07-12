package by.introduction_to_java_online.main.tasks.module_1.branching;
/*
Условие:
Найти max{min(a,b),min(c,d)}.
 */

import by.introduction_to_java_online.main.tasks.TrainingIO;

public class Task2 {
    TrainingIO trainingIO = new TrainingIO();

    void maxMinCalc(int a, int b, int c, int d) {
        int minab = a < b ? a : b;
        int mincd = c < d ? c : d;
        if (minab > mincd) {
            trainingIO.printing(minab + " is biggest of minimums");
        } else trainingIO.printing(mincd + " is biggest of minimums");
    }
}
