package by.introduction_to_java_online.main.tasks.module_2.multidimensional_array;

import by.introduction_to_java_online.main.tasks.TrainingIO;

/*
Сформировать случайную матрицу mxn, состоящую из нулей и единиц, причем в каждом столбце число единиц равно
номеру столбца.
 */

public class Task14 {
    TrainingIO trainingIO = new TrainingIO();

    public void randomMatrixMN() {
        trainingIO.printing("Enter the order of the matrix ");
        int m = Integer.parseInt(trainingIO.input());
        int count = 0;
        int random;
        int[][] array = new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; ; j++) {
                random = (int) (Math.random() * m);
                if (array[random][i] != 1 & count < j + 1) {
                    array[random][i] = 1;
                    count++;
                }
                if (count == i + 1) {
                    break;
                }

            }
            count = 0;
        }
        ArrayPrint arrayPrint = new ArrayPrint();
        trainingIO.printing("Generated array: \n");
        arrayPrint.arrayPrint(array);
    }

    public void randomMatrixMN(int m) {
        int count = 0;
        int random;
        int[][] array = new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; ; j++) {
                random = (int) (Math.random() * m);
                if (array[random][i] != 1 & count < j + 1) {
                    array[random][i] = 1;
                    count++;
                }
                if (count == i + 1) {
                    break;
                }

            }
            count = 0;
        }
        ArrayPrint arrayPrint = new ArrayPrint();
        trainingIO.printing("Generated array: \n");
        arrayPrint.arrayPrint(array);
    }
}

