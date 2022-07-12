package by.introduction_to_java_online.main.tasks.module_2.decomposition.task_2;

/*
Условие:
Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
 */

import by.introduction_to_java_online.main.tasks.TrainingIO;

public class Task2 {
    TrainingIO trainingIO = new TrainingIO();

    public void startTask2() {
        trainingIO.printing("NOD of numbers 2, 4, 6, 8 is " + nODFound(2, 4, 6, 8));
    }

    public int nODFound(int a, int b, int c, int d) {
        int[] array = new int[]{a, b, c, d};
        NodeCalculation nodeCalculationArray = new NodeCalculation();

        return nodeCalculationArray.nODCalculation(array);
    }

}
