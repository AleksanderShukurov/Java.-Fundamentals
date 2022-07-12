package by.introduction_to_java_online.main.tasks.module_2.one_dimensional_array_sorting;

/*
Условие:
Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию. Делается это следующим
образом: сравниваются два соседних элемента ai и ai+1. Если ai<=ai+1, то продвигаются на один элемент вперед. Если
ai>ai+1, то производится перестановка и сдвигаются на один элемент назад. Составить алгоритм этой сортировки.
 */

import by.introduction_to_java_online.main.tasks.TrainingIO;

public class Task6 {
    TrainingIO trainingIO = new TrainingIO();

    public void shellSorting() {
        ArrayCreate arrayCreate = new ArrayCreate();
        ArrayPrint arrayPrint = new ArrayPrint();
        int[] array = arrayCreate.arrayCreate(10);
        trainingIO.printing("Initial array:");
        arrayPrint.arrayPrinting(array);
        int tempVar;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                {
                    tempVar = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tempVar;
                    if (i >= 1) {
                        i -= 2;
                    }

                }
            }

        }
        trainingIO.printing("Sorted array:");
        arrayPrint.arrayPrinting(array);
    }
}
