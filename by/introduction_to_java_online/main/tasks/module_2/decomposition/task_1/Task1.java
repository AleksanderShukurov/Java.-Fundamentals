package by.introduction_to_java_online.main.tasks.module_2.decomposition.task_1;

/*
Условие:
Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух натуральных чисел:
                                                (НОК(A,B) = A*B/НОД(A,B);
 */

import by.introduction_to_java_online.main.tasks.TrainingIO;

public class Task1 {
    TrainingIO trainingIO = new TrainingIO();
    MinNumberDetect minNumberDetect = new MinNumberDetect();

    public void startTask1(int[] a) {
        trainingIO.printing("NOK of number 27 and 36 is " + nOKCalc(a));
        trainingIO.printing("NOD of number 27 and 36 is " + nODCalculation(a));
    }

    public int nOKCalc(int[] a) {
        int nok = a[0];
        cycle:
        for (int i = 0; ; i++) {
            nok++;
            for (int k : a) {
                if (nok % k != 0) {
                    continue cycle;
                }
            }
            return nok;
        }
    }

    public int nODCalculation(int a, int b) {
        int nok;
        int numerator = a * b;
        int[] array = new int[]{a, b};
        nok = numerator / nOKCalc(array);
        return nok;
    }

    public int nODCalculation(int[] a) {

        int nod = 0;
        for (int i = 1; i <= minNumberDetect.findMinNumber(a); i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[j] % i != 0) {
                    break;
                }
                if (j == a.length - 1) {
                    nod = i;
                }

            }

        }
        return nod;
    }

}
