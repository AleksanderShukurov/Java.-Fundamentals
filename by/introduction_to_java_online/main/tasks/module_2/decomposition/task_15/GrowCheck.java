package by.introduction_to_java_online.main.tasks.module_2.decomposition.task_15;

import by.introduction_to_java_online.main.tasks.module_2.decomposition.NumberOfDigitsInANumber;

public class GrowCheck {
    boolean growingChecking(int[] array) {
        NumberOfDigitsInANumber numberOfDigitsInANumber = new NumberOfDigitsInANumber();
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {

            if ((array[i + 1] - array[i]) != 1) {
                return false;
            }
        }
        return true;
    }
}
