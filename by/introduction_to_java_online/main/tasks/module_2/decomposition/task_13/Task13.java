package by.introduction_to_java_online.main.tasks.module_2.decomposition.task_13;

import by.introduction_to_java_online.main.tasks.TrainingIO;

import java.util.ArrayList;

/*
Условие:
Два простых числа называются "близнецами", если они отличаются друг от друга на 2 (например, 41 и 43). Найти и
напечатать все пары "близнецов" из отрезка [n, 2n], где n - заданное натуральное число больше 2. Для решения задачи
использовать декомпозицию.
 */

public class Task13 {
    TrainingIO trainingIO = new TrainingIO();

    public void twinsDetection() {
        PrimeNumber primeNumber = new PrimeNumber();
        ArrayPrint arrayPrint = new ArrayPrint();
        trainingIO.printing("Enter number n >>");
        int n = Integer.parseInt(trainingIO.input());
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i = n; i < 2 * n - 2; i++) {
            if (primeNumber.checkingPrimeNumber(i) & primeNumber.checkingPrimeNumber(i + 2)) {
                a.add(i);
                a.add(i + 2);
            }
        }
        trainingIO.printing("All pairs of twins from " + n + " to " + 2 * n + " is:");
        arrayPrint.arrayPrintingDouble(a);

    }

    public void twinsDetection(int n) {
        PrimeNumber primeNumber = new PrimeNumber();
        ArrayPrint arrayPrint = new ArrayPrint();
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i = n; i < 2 * n - 2; i++) {
            if (primeNumber.checkingPrimeNumber(i) & primeNumber.checkingPrimeNumber(i + 2)) {
                a.add(i);
                a.add(i + 2);
            }
        }
        trainingIO.printing("All pairs of twins from " + n + " to " + 2 * n + " is:");
        arrayPrint.arrayPrintingDouble(a);

    }
}
