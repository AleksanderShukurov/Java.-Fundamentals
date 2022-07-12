package by.introduction_to_java_online.main.tasks.module_2.one_dimensional_array_sorting;

/*
Класс для определения наиболшего общего делителя.
 */

public class NODCalculation {
    int nODCalculation(int a, int b) {
        NOKCalculation nokCalculation = new NOKCalculation();
        int nok;
        int numerator = a * b;
        int[] array = new int[]{a, b};
        nok = numerator / nokCalculation.nOKCalc(array);
        return nok;
    }

    int nODCalculationManyNumbers(int[] a) {
        MinNumberDetect minNumberDetect = new MinNumberDetect();
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
