package by.introduction_to_java_online.main.tasks.module_1.loops;

import by.introduction_to_java_online.main.tasks.TrainingIO;

import java.math.BigInteger;

/*
Условие:
Составить программу нахождения произведения квадратов первых двухсот чисел.
 */

public class Task4 {
    TrainingIO trainingIO = new TrainingIO();

    void multiPower() {
        BigInteger sum = BigInteger.valueOf(1);
        for (int i = 1; i <= 200; i++) {
            sum = sum.multiply(BigInteger.valueOf(i * i));
        }
        trainingIO.printing(String.valueOf(sum));
    }
}
