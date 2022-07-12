package by.introduction_to_java_online.main.tasks.module_2.one_dimensional_array_sorting;

/*
Условие:
Даны две последовательности a1<=a2<=...<=an и b1<=b2<=...bm. Образовать из них новую последовательность чисел так,
чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.
 */

import by.introduction_to_java_online.main.tasks.TrainingIO;

public class Task2 {
    TrainingIO trainingIO = new TrainingIO();

    public void arrayUnionUp() {
        ArrayCreate arrayCreate = new ArrayCreate();
        ArrayPrint arrayPrint = new ArrayPrint();
        int[] firstArray = arrayCreate.growingArrayCreate();
        trainingIO.printing("First created array:");
        arrayPrint.arrayPrinting(firstArray);
        int[] secondArray = arrayCreate.growingArrayCreate();
        trainingIO.printing("Second created array:");
        arrayPrint.arrayPrinting(secondArray);
        int[] unionArray = new int[firstArray.length + secondArray.length];
        for (int i = 0, l = 0, k = 0; i < unionArray.length; i++, l++, k++) {
            if (k < secondArray.length & l < firstArray.length) {
                if (firstArray[l] <= secondArray[k]) {
                    unionArray[i] = firstArray[l];
                    k--;
                } else if (firstArray[l] > secondArray[k]) {
                    unionArray[i] = secondArray[k];
                    l--;
                }
            } else if (k < secondArray.length & l >= firstArray.length) {
                unionArray[i] = secondArray[k];
            } else if (k >= secondArray.length & l < firstArray.length) {
                unionArray[i] = firstArray[l];
            }
        }
        trainingIO.printing("New merged array: \n");
        arrayPrint.arrayPrinting(unionArray);
    }

    public void arrayUnionUp(int firstArrayLength, int secondArrayLength) {
        ArrayCreate arrayCreate = new ArrayCreate();
        ArrayPrint arrayPrint = new ArrayPrint();
        int[] firstArray = arrayCreate.growingArrayCreate(firstArrayLength);
        trainingIO.printing("First created array:");
        arrayPrint.arrayPrinting(firstArray);
        int[] secondArray = arrayCreate.growingArrayCreate(secondArrayLength);
        trainingIO.printing("Second created array:");
        arrayPrint.arrayPrinting(secondArray);
        int[] unionArray = new int[firstArray.length + secondArray.length];
        for (int i = 0, l = 0, k = 0; i < unionArray.length; i++, l++, k++) {
            if (k < secondArray.length & l < firstArray.length) {
                if (firstArray[l] <= secondArray[k]) {
                    unionArray[i] = firstArray[l];
                    k--;
                } else if (firstArray[l] > secondArray[k]) {
                    unionArray[i] = secondArray[k];
                    l--;
                }
            } else if (k < secondArray.length & l >= firstArray.length) {
                unionArray[i] = secondArray[k];
            } else if (k >= secondArray.length & l < firstArray.length) {
                unionArray[i] = firstArray[l];
            }
        }
        trainingIO.printing("New merged array:");
        arrayPrint.arrayPrinting(unionArray);
    }
}

