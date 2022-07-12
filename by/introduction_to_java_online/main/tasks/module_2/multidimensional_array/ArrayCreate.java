package by.introduction_to_java_online.main.tasks.module_2.multidimensional_array;

import by.introduction_to_java_online.main.tasks.TrainingIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayCreate {
    TrainingIO trainingIO = new TrainingIO();
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public int[][] arrayCreate() {
        trainingIO.printing("\nEnter the size of square matrix:");
        int sizeOfMatrix = 0;
        try {
            sizeOfMatrix = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.getStackTrace();
        }
        int[][] outPutArray = new int[sizeOfMatrix][sizeOfMatrix];
        for (int i = 0; i < sizeOfMatrix; i++) {
            for (int j = 0; j < sizeOfMatrix; j++) {
                outPutArray[i][j] = (int) (Math.random() * 10);
            }
        }
        return outPutArray;
    }

    public int[][] arrayCreate(int a) {
        int sizeOfMatrix = a;
        int[][] outPutArray = new int[sizeOfMatrix][sizeOfMatrix];
        for (int i = 0; i < sizeOfMatrix; i++) {
            for (int j = 0; j < sizeOfMatrix; j++) {
                outPutArray[i][j] = (int) (Math.random() * 10);
            }
        }
        return outPutArray;
    }

    public int[][] arrayCreateFNTP() {
        trainingIO.printing("\nEnter the size of square matrix:");
        int sizeOfMatrix = 0;
        try {
            sizeOfMatrix = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.getStackTrace();
        }
        int[][] outPutArray = new int[sizeOfMatrix][sizeOfMatrix];
        for (int i = 0; i < sizeOfMatrix; i++) {
            for (int j = 0; j < sizeOfMatrix; j++) {
                outPutArray[i][j] = -10 + (int) (Math.random() * ((10 - (-10)) + 1));
            }
        }
        return outPutArray;
    }

    public int[][] arrayCreateFNTP(int sizeOfMatrix) {
        int[][] outPutArray = new int[sizeOfMatrix][sizeOfMatrix];
        for (int i = 0; i < sizeOfMatrix; i++) {
            for (int j = 0; j < sizeOfMatrix; j++) {
                outPutArray[i][j] = -10 + (int) (Math.random() * ((10 - (-10)) + 1));
            }
        }
        return outPutArray;
    }
}
