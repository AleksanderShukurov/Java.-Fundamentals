package by.introduction_to_java_online.main.tasks.module_1.linear_programs;
/*
Условие:
Для данной области составить линейную программу, которая печатает true, если точка с координатами (x,y) принадлежит
закрашенной области, false - в противном случае.
 */

import by.introduction_to_java_online.main.tasks.TrainingIO;

public class Task6 {
    TrainingIO trainingIO = new TrainingIO();

    void didInclude(int x, int y) {
        if (x >= 0 & x <= 4) {
            if (y <= 2 & y >= -2) {
                trainingIO.printing("Point place is inside the zone");
            } else {
                trainingIO.printing("Point place is outside the zone");
            }
        } else if (x >= -3 & x < 0) {
            if (y >= -4 & y <= 4) {
                trainingIO.printing("Point place is inside the zone");
            } else {
                trainingIO.printing("Point place is outside the zone");
            }
        } else {
            trainingIO.printing("Point place is outside the zone");
        }
    }
}
