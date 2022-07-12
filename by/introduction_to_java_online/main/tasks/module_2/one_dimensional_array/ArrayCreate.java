package by.introduction_to_java_online.main.tasks.module_2.one_dimensional_array;
/*
Дополнительный класс для генерации массивов случайными числами. Метод для генерации только положительных действительных чисел arrayCreate.
Метод для генерации действительных чисел (в т.ч. и отрицательных arrayCreateFNTP).
 */

public class ArrayCreate {
    int[] arrayCreate(int a) {
        int[] array1 = new int[a];
        for (int i = 0; i < a; i++) {
            array1[i] = (int) (Math.random() * 10);
        }

        return array1;
    }

    int[] arrayCreateFNTP(int a) {
        int[] array1 = new int[a];
        for (int i = 0; i < a; i++) {
            array1[i] = -10 + (int) (Math.random() * ((10 - (-10)) + 1));
        }
        return array1;
    }

}

