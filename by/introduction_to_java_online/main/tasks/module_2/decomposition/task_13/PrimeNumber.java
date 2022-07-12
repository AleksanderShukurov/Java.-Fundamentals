package by.introduction_to_java_online.main.tasks.module_2.decomposition.task_13;

/*
Метод определяющий, является ли передаваемый параметр простым.
 */
public class PrimeNumber {
    boolean checkingPrimeNumber(int a) {
        if (a < 1) return false;
        if (a == 1 || a == 2) {
            return true;
        }
        for (int i = 2; i <= a / 2; i++) {
            if (a % i == 0) {
                return false;

            }
        }
        return true;
    }
}
