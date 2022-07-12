package by.introduction_to_java_online.main.tasks.module_4.simple_classes_and_objects.task_5;

import java.util.Arrays;

public class InputOutput {
    private DecimalCounter decimalCounter;

    public DecimalCounter getDecimalCounter() {
        return decimalCounter;
    }

    public void setDecimalCounter(DecimalCounter decimalCounter) {
        this.decimalCounter = decimalCounter;
    }

    public void printCount(int... counter) {
        if (counter.length == 1) {
            System.out.print("Current position of counter is: " + Arrays.toString(counter));
        } else {
            for (int a : counter
            ) {
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }
}
