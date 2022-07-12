package by.introduction_to_java_online.main.tasks.module_2.multidimensional_array;

import by.introduction_to_java_online.main.tasks.TrainingIO;

/*
Условие:
В числовой матрице поменять местанми два любых столбца, т.е. все элементы одного столбца поставить на соответствующие
им позиции другого, а элементы второго переместить в первый. Номера столбцов вводит пользователь с клавиатуры.
 */

public class Task8 {
    TrainingIO trainingIO = new TrainingIO();

    public void columnChange() {
        ArrayCreate arrayCreate = new ArrayCreate();
        ArrayPrint arrayPrint = new ArrayPrint();
        int[][] array = arrayCreate.arrayCreate(6);
        int matrixOrder = 6;
        trainingIO.printing("Enter first column to change. Number of column in matrix is " + matrixOrder);
        int firstColumn = Integer.parseInt(trainingIO.input());
        trainingIO.printing("Enter second column to change. Number of column in matrix is " + matrixOrder);
        int secondColumn = Integer.parseInt(trainingIO.input());
        trainingIO.printing("Initial array: ");
        arrayPrint.arrayPrint(array);
        for (int i = 0; i < array.length; i++) {
            int var = array[i][firstColumn];
            array[i][firstColumn] = array[i][secondColumn];
            array[i][secondColumn] = var;
        }
        trainingIO.printing("Changed array: ");
        arrayPrint.arrayPrint(array);
    }

    public void columnChange(int firstColumn, int secondColumn) {
        ArrayCreate arrayCreate = new ArrayCreate();
        ArrayPrint arrayPrint = new ArrayPrint();
        int[][] array = arrayCreate.arrayCreate(6);
        trainingIO.printing("Initial array: ");
        arrayPrint.arrayPrint(array);
        for (int i = 0; i < array.length; i++) {
            int var = array[i][firstColumn];
            array[i][firstColumn] = array[i][secondColumn];
            array[i][secondColumn] = var;
        }
        trainingIO.printing("Changed array: ");
        arrayPrint.arrayPrint(array);
    }
}
