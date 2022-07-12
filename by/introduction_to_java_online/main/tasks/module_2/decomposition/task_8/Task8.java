package by.introduction_to_java_online.main.tasks.module_2.decomposition.task_8;

import by.introduction_to_java_online.main.tasks.TrainingIO;

/*
Условие:
Задан массив D. Определить суммы: D[1] + D[2] + D[3], D[3] + D[4] + D[5]; D[4] + D[5] + D[6].
Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов массива с
номерами от k до m.
 */

public class Task8 {
    TrainingIO trainingIO = new TrainingIO();

    public void sumOfThreeNumbersCalculation() {
        int[] array = new int[]{1, 3, 5, 7, 9, 2, 4, 6, 8, 23};
        SumOfElement sumOfElement = new SumOfElement();
        trainingIO.printing("Enter first index of array");
        int firstElementOfArray = Integer.parseInt(trainingIO.input());
        trainingIO.printing("Enter second index of array");
        int secondElementOfArray = Integer.parseInt(trainingIO.input());
        trainingIO.printing("Sum of the elements of the array is " + sumOfElement.sumCalculation(array, firstElementOfArray, secondElementOfArray));

    }

    public void sumOfThreeNumbersCalculation(int firstElementOfArray, int secondElementOfArray) {
        int[] array = new int[]{1, 3, 5, 7, 9, 2, 4, 6, 8, 23};
        SumOfElement sumOfElement = new SumOfElement();
        trainingIO.printing("Sum of the elements of the array is " + sumOfElement.sumCalculation(array, firstElementOfArray, secondElementOfArray));

    }
}
