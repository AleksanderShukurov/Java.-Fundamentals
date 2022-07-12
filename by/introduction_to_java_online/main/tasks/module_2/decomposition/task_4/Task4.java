package by.introduction_to_java_online.main.tasks.module_2.decomposition.task_4;

/*
Условие:
На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими из пар точек самое
большое расстояние. Указание. Координаты точек занести в массив.
 */

import by.introduction_to_java_online.main.tasks.TrainingIO;

public class Task4 {
    TrainingIO trainingIO = new TrainingIO();

    public void startTask4(int[][] b) {
        int[] c = dotsDistance(b);
        trainingIO.printing("Coordinates of points located at the greatest distance from each other is " + b[c[0]][0] + ", " + b[c[0]][1] + " and " + b[c[1]][0] + ", " + b[c[1]][1] + ".");
    }

    public int[] dotsDistance(int[][] a) {
        double absoluteDistance;
        int xDistance;
        int yDistance;
        double maxDistance = 0;
        int maxDistanceFirstIndex = 0;
        int maxDistanceSecondIndex = 0;


        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                xDistance = a[i][0] - a[j][0];
                yDistance = a[i][1] - a[j][1];
                absoluteDistance = Math.sqrt(Math.pow(xDistance, 2) * Math.pow(yDistance, 2));
                if (absoluteDistance > maxDistance) {
                    maxDistance = absoluteDistance;
                    maxDistanceFirstIndex = i;
                    maxDistanceSecondIndex = j;
                }
            }
        }
        return new int[]{maxDistanceFirstIndex, maxDistanceSecondIndex};
    }
}
