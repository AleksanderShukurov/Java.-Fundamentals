package by.introduction_to_java_online.main.tasks.module_2.decomposition.task_7;

public class Factorial {
    long factorialCalculation(int a) {
        long factorial = 1;
        if (a == 1) {
            return factorial;
        }
        for (int i = 1; i <= a; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
