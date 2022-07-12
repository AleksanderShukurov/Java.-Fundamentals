package by.introduction_to_java_online.main.tasks.module_2.one_dimensional_array;
/*
Условие:
Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых являются простыми числами.
 */

import by.introduction_to_java_online.main.tasks.TrainingIO;

public class Task6 {
    TrainingIO trainingIO = new TrainingIO();

    void ifSimplePrint() {
        ArrayCreate arrayCreate = new ArrayCreate();
        IsSimple isSimple = new IsSimple();
        int[] a = arrayCreate.arrayCreate(10);
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (isSimple.isSimple(i)) {
                sum += a[i];
            }
        }
        trainingIO.printing("Sum of the numbers, which indexes are simple is: " + sum);
    }
}
