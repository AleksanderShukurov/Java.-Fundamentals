package by.introduction_to_java_online.main.tasks.module_2.one_dimensional_array;

/*
Условие:
Дан целочисленный массив с количеством элементов n. Сжать массив, выбросив из него каждый второй элемент (освободившиеся элементы заполнить нулями).
Примечание. Дополнительный массив не использовать.
 */

import by.introduction_to_java_online.main.tasks.TrainingIO;

public class Task10 {
    TrainingIO trainingIO = new TrainingIO();

    void evenIndexDelete() {
        ArrayCreate arrayCreate = new ArrayCreate();
        int n = 10;
        int[] a = arrayCreate.arrayCreate(n);
        trainingIO.printing("Initial array: \n");
        for (int b : a
        ) {
            trainingIO.printingToTheSameLine(b + " ");
        }
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (++count % 2 == 0) {
                a[i] = 0;
            }

        }
        trainingIO.printing("\n Changed array: \n");
        for (int c : a
        ) {
            trainingIO.printingToTheSameLine(c + " ");
        }
    }
}
