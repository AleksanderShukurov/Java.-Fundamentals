package by.introduction_to_java_online.main.tasks.module_2.one_dimensional_array_sorting;

/*
Условие:
Дана последовательность чисел a1, a2,...,an. Требуется переставить числа в порядке возрастания. Делается это следующим
образом. Пусть a1, a2,...,an - упорядоченая последовательность, т.е. a1<=a2<=...<=an. Берется слдующее число ai+1 и
вставляется в последовательность так, чтобы новая последовательность была тоже возрастающей. Процесс производится
до тех пор, пока все элементы в отсортированную часть производить с помощью двоичного поиска. Двоичный поиск оформить в
виде отдельной функции.
 */

import by.introduction_to_java_online.main.tasks.TrainingIO;

public class Task5 {
    TrainingIO trainingIO = new TrainingIO();

    public void sortingByInsertion() {
        ArrayCreate arrayCreate = new ArrayCreate();
        ArrayPrint arrayPrint = new ArrayPrint();
        int[] array = arrayCreate.arrayCreate(10);
        trainingIO.printing("Initial array:");
        arrayPrint.arrayPrinting(array);
        int tempVar;
        int inputIndex;

        if (array[0] > array[1]) {
            tempVar = array[0];
            array[0] = array[1];
            array[1] = tempVar;
        } //Sorting first elements of array.

        BinarySearch binarySearch = new BinarySearch();
        trainingIO.printing("Sorted array:");

        for (int i = 1; i < array.length; i++) {
            inputIndex = binarySearch.binarySearchMethod(array, 0, i, array[i]);
            tempVar = array[i];

            for (int j = i; j > inputIndex + 1; j--) {
                array[j] = array[j - 1];
            }
            array[inputIndex + 1] = tempVar;
        }
        arrayPrint.arrayPrinting(array);
    }
}

