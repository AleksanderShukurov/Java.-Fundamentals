package by.introduction_to_java_online.main.tasks.module_2.one_dimensional_array_sorting;

/*
Условие:
Пусть даны две неубывающие последовательности действительных чисел a1<=a2<=...<=an и b1<=b2<=...<=bm. Требуется указать
те места, на которые нужно вставлять элементы последовательности b1<=b2<=...<=bm в первую последовательность так, чтобы
новая последовательность оставалась возрастающей.
 */

import by.introduction_to_java_online.main.tasks.TrainingIO;

public class Task7 {
    TrainingIO trainingIO = new TrainingIO();

    public void twoArrayCombining() {
        ArrayCreate arrayCreate = new ArrayCreate();
        ArrayPrint arrayPrint = new ArrayPrint();
        int[] firstArray = arrayCreate.growingArrayCreate();
        trainingIO.printing("First created array:");
        arrayPrint.arrayPrinting(firstArray);
        int[] secondArray = arrayCreate.growingArrayCreate();
        trainingIO.printing("Second created array:");
        arrayPrint.arrayPrinting(secondArray);
        int[] unionArray = new int[firstArray.length + secondArray.length];
        int[] indexes = new int[secondArray.length];
        for (int i = 0, l = 0, k = 0, j = 0; i < unionArray.length; i++, l++, k++) {
            if (k < secondArray.length & l < firstArray.length) {
                if (firstArray[l] <= secondArray[k]) {
                    unionArray[i] = firstArray[l];
                    k--;
                } else if (firstArray[l] > secondArray[k]) {
                    unionArray[i] = secondArray[k];
                    indexes[j] = i;
                    l--;
                    j++;
                }
            } else if (k < secondArray.length & l >= firstArray.length) {
                unionArray[i] = secondArray[k];
                indexes[j] = i;
                j++;
            } else if (k >= secondArray.length & l < firstArray.length) {
                unionArray[i] = firstArray[l];
            }
        }
        trainingIO.printing("indexes of the new array where the elements of the second array were inserted: ");
        for (Integer ints : indexes
        ) {
            trainingIO.printingToTheSameLine(ints + " ");
        }
        trainingIO.printing("New array printing:");
        arrayPrint.arrayPrinting(unionArray);
    }

    public void twoArrayCombining(int firstArrayLength, int secondArrayLength) {
        ArrayCreate arrayCreate = new ArrayCreate();
        ArrayPrint arrayPrint = new ArrayPrint();
        int[] firstArray = arrayCreate.growingArrayCreate(firstArrayLength);
        trainingIO.printing("First created array:");
        arrayPrint.arrayPrinting(firstArray);
        int[] secondArray = arrayCreate.growingArrayCreate(secondArrayLength);
        trainingIO.printing("Second created array:");
        arrayPrint.arrayPrinting(secondArray);
        int[] unionArray = new int[firstArray.length + secondArray.length];
        int[] indexes = new int[secondArray.length];
        for (int i = 0, l = 0, k = 0, j = 0; i < unionArray.length; i++, l++, k++) {
            if (k < secondArray.length & l < firstArray.length) {
                if (firstArray[l] <= secondArray[k]) {
                    unionArray[i] = firstArray[l];
                    k--;
                } else if (firstArray[l] > secondArray[k]) {
                    unionArray[i] = secondArray[k];
                    indexes[j] = i;
                    l--;
                    j++;
                }
            } else if (k < secondArray.length & l >= firstArray.length) {
                unionArray[i] = secondArray[k];
                indexes[j] = i;
                j++;
            } else if (k >= secondArray.length & l < firstArray.length) {
                unionArray[i] = firstArray[l];
            }
        }
        trainingIO.printing("indexes of the new array where the elements of the second array were inserted: ");
        for (Integer ints : indexes
        ) {
            trainingIO.printingToTheSameLine(ints + " ");
        }
        trainingIO.printing("New array printing:");
        arrayPrint.arrayPrinting(unionArray);
    }
}

