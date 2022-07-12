package by.introduction_to_java_online.main.tasks.module_2.one_dimensional_array_sorting;

/*
Класс для нахождения минимального значения, для определения наибольшего общего делителя.
 */

public class MinNumberDetect {
    int findMinNumber(int[] a) {
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }
}
