package by.introduction_to_java_online.main.tasks.module_2.decomposition.task_12;

import by.introduction_to_java_online.main.tasks.TrainingIO;

import java.util.ArrayList;

/*
Условие:
Даны натуральные числа K и N. Написать метод(методы) формирования массива A, элементами которого являются числа, сумма
цифр которых равна K и которые не больше N.
 */

public class Task12 {
    TrainingIO trainingIO = new TrainingIO();

    public void arrayForming() {
        ArrayPrint arrayPrint = new ArrayPrint();
        trainingIO.printing("Enter number k >>");
        int k = Integer.parseInt(trainingIO.input());
        trainingIO.printing("Enter number n >>");
        int n = Integer.parseInt(trainingIO.input());
        SumOfDigits sumOfDigits = new SumOfDigits();
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i = 1; i < n; i++) {
            if (sumOfDigits.sumOdDigitsCalculation(i) == k) {
                a.add(i);
            }
        }
        trainingIO.printing("Numbers that meet the task condition is:");
        arrayPrint.arrayPrinting(a);
    }

    public void arrayForming(int k, int n) {
        ArrayPrint arrayPrint = new ArrayPrint();
        SumOfDigits sumOfDigits = new SumOfDigits();
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i = 1; i < n; i++) {
            if (sumOfDigits.sumOdDigitsCalculation(i) == k) {
                a.add(i);
            }
        }
        trainingIO.printing("Numbers that meet the task condition is:");
        arrayPrint.arrayPrinting(a);
    }
}
