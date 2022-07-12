package by.introduction_to_java_online.main.tasks.module_2.decomposition.task_17;

public class NumberOfSubtraction {
    int numberOfSubtractionsCalculation(int a) {
        SumOfDigits sumOfDigits = new SumOfDigits();
        int count = 0;
        do {
            a -= sumOfDigits.sumOdDigitsCalculation(a);
            count++;
        }
        while (a != 0);
        return count;
    }
}
