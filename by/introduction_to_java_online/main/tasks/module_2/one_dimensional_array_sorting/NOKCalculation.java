package by.introduction_to_java_online.main.tasks.module_2.one_dimensional_array_sorting;

/*
Класс для нахождения наименьшего общего кратного.
 */

public class NOKCalculation {
    int nOKCalc(int[] a) {
        int nok = (int) a[0];
        cycle:
        for (int i = 0; ; i++) {
            nok++;
            for (int j = 0; j < a.length; j++) {
                if (nok % a[j] != 0) {
                    continue cycle;
                }
            }
            return nok;
        }
    }
}
