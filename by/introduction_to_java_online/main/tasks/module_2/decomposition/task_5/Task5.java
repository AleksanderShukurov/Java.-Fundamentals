package by.introduction_to_java_online.main.tasks.module_2.decomposition.task_5;

/*
Условие:
Составить программу, которая в массиве A[N] находит второе по велечине число (вывести на печать число,
которое меньше максимального элемента массива, но больше всех других элементов.)
 */

import by.introduction_to_java_online.main.tasks.TrainingIO;

public class Task5 {
    TrainingIO trainingIO = new TrainingIO();

    public void startTask5(int[] maximumValues) {
        MaximumDefine maximumDefine = new MaximumDefine();
        int preMax = preMaximalDefinition(maximumValues, maximumDefine.maximumDefinition(maximumValues));
        trainingIO.printing("Pre-maximal value of array is " + preMax);
    }

    public int preMaximalDefinition(int[] a, int max) {
        int preMax;
        do {
            preMax = a[(int) (Math.random() * a.length)];
        } while (preMax == max);

        for (int j : a) {
            if (j > preMax && j != max) {
                preMax = j;
            }
        }
        return preMax;
    }
}

