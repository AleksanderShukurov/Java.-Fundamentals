package by.introduction_to_java_online.main.tasks.module_2.multidimensional_array;

/*
Условие:
Матрицу 10х20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в которых число 5 встречается три и более раз;
 */

import by.introduction_to_java_online.main.tasks.TrainingIO;

public class Task11 {
    TrainingIO trainingIO = new TrainingIO();

    public void sumOfLineWithFiveMoreThenThreeTime() {
        int[][] array = new int[10][20];
        int count = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                array[i][j] = (int) (Math.random() * 10);
            }
        }
        trainingIO.printing("Initial array: \n");
        for (int i = 0; i < 10; i++) {
            trainingIO.printing("");
            for (int j = 0; j < 20; j++) {
                trainingIO.printingToTheSameLine(array[i][j] + "  ");
            }
        }
        trainingIO.printing("\n\nLines have more than 3 number 5 is: ");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                if (array[i][j] == 5) {
                    count++;
                }
                if (count > 3) {
                    trainingIO.printingToTheSameLine((i) + " ");
                    break;
                }
            }
            count = 0;
        }

    }
}
