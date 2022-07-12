package by.introduction_to_java_online.main.tasks.module_2.one_dimensional_array_sorting;

import by.introduction_to_java_online.main.tasks.TrainingIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayCreate {
    TrainingIO trainingIO = new TrainingIO();
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public int[] arrayCreate() {
        trainingIO.printing("\nEnter length of the array:");
        int sizeOfMatrix = 0;
        try {
            sizeOfMatrix = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.getStackTrace();
        }
        int[] outPutArray = new int[sizeOfMatrix];
        for (int i = 0; i < sizeOfMatrix; i++) {
            outPutArray[i] = (int) (Math.random() * 10);
        }
        return outPutArray;
    }

    public int[] arrayCreate(int a) {
        int sizeOfMatrix = a;
        int[] outPutArray = new int[sizeOfMatrix];
        for (int i = 0; i < sizeOfMatrix; i++) {

            outPutArray[i] = (int) (Math.random() * 100);
        }

        return outPutArray;
    }

    public int[] arrayCreateFNTP() {
        trainingIO.printing("\nEnter length of the array:");
        int sizeOfMatrix = 0;
        try {
            sizeOfMatrix = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.getStackTrace();
        }
        int[] outPutArray = new int[sizeOfMatrix];
        for (int i = 0; i < sizeOfMatrix; i++) {
            outPutArray[i] = -10 + (int) (Math.random() * ((10 - (-10)) + 1));
        }
        return outPutArray;
    }

    public int[] growingArrayCreate() {
        trainingIO.printing("\nEnter length of the array:");
        int sizeOfMatrix = 0;
        try {
            sizeOfMatrix = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.getStackTrace();
        }
        int[] outPutArray = new int[sizeOfMatrix];
        int max = outPutArray[0];
        for (int i = 0; i < sizeOfMatrix; i++) {
            int temp = outPutArray[0];
            do {
                outPutArray[i] = (int) (Math.random() * (i + 1) * 10);
                temp = outPutArray[i];
                if (max < temp) {
                    max = temp;
                }
            }
            while (temp < max);
        }
        return outPutArray;
    }

    public int[] growingArrayCreate(int sizeOfMatrix) {
        int[] outPutArray = new int[sizeOfMatrix];
        int max = outPutArray[0];
        for (int i = 0; i < sizeOfMatrix; i++) {
            int temp;
            do {
                outPutArray[i] = (int) (Math.random() * (i + 1) * 10);
                temp = outPutArray[i];
                if (max < temp) {
                    max = temp;
                }
            }
            while (temp < max);
        }
        return outPutArray;
    }
}
