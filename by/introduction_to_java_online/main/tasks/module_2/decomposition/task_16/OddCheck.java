package by.introduction_to_java_online.main.tasks.module_2.decomposition.task_16;

/*
Метод проверки числа на нечетность.
 */
public class OddCheck {
    boolean checkingOddNumber(int[] a) {
        int tempVar;
        for (int i = 0; i < a.length; i++) {
            tempVar = a[i] % 10;
            if (tempVar % 2 == 0) {
                return false;
            }
        }
        return true;
    }
}
