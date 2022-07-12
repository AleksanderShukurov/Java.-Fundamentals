package by.introduction_to_java_online.main.tasks.module_2.multidimensional_array;

import by.introduction_to_java_online.main.tasks.TrainingIO;

/*
Условие:
Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3, ..., n^2 так,
что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между собой. Построить такой
квадрат. Пример магического квадрата порядка 3:
                                                            6  1  8
                                                            7  5  3
                                                            2  9  4
 */

public class Task16 {
    TrainingIO trainingIO = new TrainingIO();

    public void magicSquare() {
        trainingIO.printing("Enter size n of the magic square");
        int n = Integer.parseInt(trainingIO.input());
        oddOrder oddOrder = new oddOrder();
        EvenOrder evenOrder = new EvenOrder();
        ArrayPrint arrayPrint = new ArrayPrint();
        int[][] magicSquare;
        if (n % 2 == 0) {
            magicSquare = evenOrder.magicSquareEvenOrder(n);
        } else

            magicSquare = oddOrder.magicSquareOddOrder(n);
        trainingIO.printing("Generated magic square: \n");
        arrayPrint.arrayPrint(magicSquare);
    }

    public void magicSquare(int n) {
        oddOrder oddOrder = new oddOrder();
        EvenOrder evenOrder = new EvenOrder();
        ArrayPrint arrayPrint = new ArrayPrint();
        int[][] magicSquare;
        if (n % 2 == 0) {
            magicSquare = evenOrder.magicSquareEvenOrder(n);
        } else

            magicSquare = oddOrder.magicSquareOddOrder(n);
        trainingIO.printing("\n Generated magic square: \n");
        arrayPrint.arrayPrint(magicSquare);
    }
}
