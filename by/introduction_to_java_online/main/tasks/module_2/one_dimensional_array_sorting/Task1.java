package by.introduction_to_java_online.main.tasks.module_2.one_dimensional_array_sorting;

import by.introduction_to_java_online.main.tasks.TrainingIO;

/*
Условие:
Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в один массив,
включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя дополнительный массив.
 */

public class Task1 {
    TrainingIO trainingIO = new TrainingIO();

    public void arrayUnion() {
        ArrayCreate arrayCreate = new ArrayCreate();
        trainingIO.printing("Enter first array length: \n>>>");
        int[] array1 = arrayCreate.arrayCreate(Integer.parseInt(trainingIO.input()));

        trainingIO.printing("Enter second array length: \n>>>");
        int[] array2 = arrayCreate.arrayCreate(Integer.parseInt(trainingIO.input()));
        trainingIO.printing("Enter natural number k: \n>>>");
        int k = Integer.parseInt(trainingIO.input());
        ArrayPrint arrayPrint = new ArrayPrint();
        trainingIO.printing("Printing first array:");
        arrayPrint.arrayPrinting(array1);
        trainingIO.printing("Printing second array:");
        arrayPrint.arrayPrinting(array2);
        int[] unionArray = new int[array1.length + array2.length];
        int count = 0;
        for (int i = 0; i < array1.length + 1; i++) {
            if (i < k) {
                unionArray[i] = array1[i];
            }
            if (i == k) {
                for (int j = 0; j < array2.length; j++) {
                    unionArray[i + j] = array2[j];
                    count++;
                }
            }
            if ((i > k)) {
                unionArray[i + count - 1] = array1[i - 1];
            }
        }
        trainingIO.printing("Printing merged array:");
        arrayPrint.arrayPrinting(unionArray);
    }

    public void arrayUnion(int firstArrayLength, int secondArrayLength, int startPosition) {
        ArrayCreate arrayCreate = new ArrayCreate();
        int[] array1 = arrayCreate.arrayCreate(firstArrayLength);
        int[] array2 = arrayCreate.arrayCreate(secondArrayLength);
        ArrayPrint arrayPrint = new ArrayPrint();
        trainingIO.printing("Printing first array:");
        arrayPrint.arrayPrinting(array1);
        trainingIO.printing("Printing second array:");
        arrayPrint.arrayPrinting(array2);
        int[] unionArray = new int[array1.length + array2.length];
        int count = 0;
        for (int i = 0; i < array1.length + 1; i++) {
            if (i < startPosition) {
                unionArray[i] = array1[i];
            }
            if (i == startPosition) {
                for (int j = 0; j < array2.length; j++) {
                    unionArray[i + j] = array2[j];
                    count++;
                }
            }
            if ((i > startPosition)) {
                unionArray[i + count - 1] = array1[i - 1];
            }
        }
        trainingIO.printing("Printing merged array:");
        arrayPrint.arrayPrinting(unionArray);
    }
}
