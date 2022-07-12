package by.introduction_to_java_online.main.tasks.module_2.one_dimensional_array_sorting;

/*
Условие:
Сортировка обменами. Дана последовательность чисел a1<=a2<=...<=an. Требуется переставить числа в порядке (возростания)?
убывания. Для этого сравниваются два соседних числа ai и ai+1. Если ai>ai+1, то делается перстановка. Так продолжается
до тех пор пока все элементы не станут расположены в порядке (возростания)? убывания. Составить алгоритм сортировки,
подсчитывая при этом количество перестановок.
 */

import by.introduction_to_java_online.main.tasks.TrainingIO;

public class Task4 {
    public void sortingBySwap() {
        TrainingIO trainingIO = new TrainingIO();
        ArrayPrint arrayPrint = new ArrayPrint();
        int[] array = new int[]{1, 3, 5, 7, 12, 20, 25};
        trainingIO.printing("Initial array:");
        arrayPrint.arrayPrinting(array);
        int count = 0;
        for (int i = 0; i < array.length; i++) {

            for (int j = i + 1; j < array.length; j++) {
                int tempVar = array[i];
                if (array[j] > array[i]) {
                    array[i] = array[j];
                    array[j] = tempVar;
                    count++;
                }
            }

        }
        trainingIO.printing("Sorted array:");
        arrayPrint.arrayPrinting(array);
        trainingIO.printing("Number of swaps is " + count);
    }
}
