package by.introduction_to_java_online.main.tasks.module_2.decomposition.task_8;

/*
Метод для вычисления суммы элементов массива.
 */
public class SumOfElement {
    int sumCalculation(int[] array, int firstIndex, int secondIndex) {
        int sum = 0;
        for (int i = firstIndex; i <= secondIndex; i++) {
            sum += array[i];
        }
        return sum;
    }

    int sumCalculation(int[] array) {
        int sum = 0;
        for (int i = 0; i <= array.length - 1; i++) {
            sum += array[i];
        }
        return sum;
    }
}
