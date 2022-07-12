package by.introduction_to_java_online.main.tasks.module_1.loops;

/*
Условие:
Найти сумму первых ста чисел.
 */

import by.introduction_to_java_online.main.tasks.TrainingIO;

public class Task3 {
    TrainingIO trainingIO = new TrainingIO();

    void addThousand() {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i * i;
        }
        trainingIO.printing(String.valueOf(sum));
    }
}
