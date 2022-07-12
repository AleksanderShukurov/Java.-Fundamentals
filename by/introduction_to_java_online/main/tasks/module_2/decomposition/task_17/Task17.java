package by.introduction_to_java_online.main.tasks.module_2.decomposition.task_17;

/*
Условие:
Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких действий надо
произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.
 */

import by.introduction_to_java_online.main.tasks.TrainingIO;

public class Task17 {
    TrainingIO trainingIO = new TrainingIO();

    public void numberOfSubtractionsPrinting(int a) {
        NumberOfSubtraction numberOfSubtraction = new NumberOfSubtraction();
        trainingIO.printing("Number of subtraction to get zero is " + numberOfSubtraction.numberOfSubtractionsCalculation(a));
    }

    public void numberOfSubtractionsPrinting() {
        int a = Integer.parseInt(trainingIO.input());
        NumberOfSubtraction numberOfSubtraction = new NumberOfSubtraction();
        trainingIO.printing("Number of subtraction to get zero is " + numberOfSubtraction.numberOfSubtractionsCalculation(a));
    }

}
