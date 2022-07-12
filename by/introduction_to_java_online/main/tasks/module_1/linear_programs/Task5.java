package by.introduction_to_java_online.main.tasks.module_1.linear_programs;

import by.introduction_to_java_online.main.tasks.TrainingIO;

import java.time.LocalTime;

/*
Условие:
Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести данное значение
длительности в часах, минутах и секундах в следующем формате: ННч ММмин SSс.
 */

public class Task5 {
    TrainingIO trainingIO = new TrainingIO();

    void timeConvert(int a) {
        trainingIO.printing(String.valueOf(LocalTime.ofSecondOfDay(a)));
    }
}
