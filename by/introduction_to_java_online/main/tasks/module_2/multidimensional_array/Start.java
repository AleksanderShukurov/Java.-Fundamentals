package by.introduction_to_java_online.main.tasks.module_2.multidimensional_array;

import by.introduction_to_java_online.main.tasks.TrainingIO;

public class Start {
    TrainingIO trainingIO = new TrainingIO();

    public void startingManual() {
        trainingIO.printing("--------------------------------------------Task 1-----------------------------------------");
        Task1 firstTask = new Task1();
        firstTask.oddBiggerPrint();
        trainingIO.printing("\n--------------------------------------------Task 2-----------------------------------------");
        Task2 secondTaskVariantTwo = new Task2();
        secondTaskVariantTwo.diagonalPrint();
        trainingIO.printing("--------------------------------------------Task 3-----------------------------------------");
        Task3 thirdTask = new Task3();
        thirdTask.kColumnPrint();
        trainingIO.printing("--------------------------------------------Task 4-----------------------------------------");
        Task4 fourTask = new Task4();
        fourTask.firstSquareMatrix();
        trainingIO.printing("--------------------------------------------Task 5-----------------------------------------");
        Task5 fiveTask = new Task5();
        fiveTask.secondSquareMatrix();
        trainingIO.printing("--------------------------------------------Task 6-----------------------------------------");
        Task6 sixTask = new Task6();
        sixTask.thirdSquareMatrix();
        trainingIO.printing("--------------------------------------------Task 7-----------------------------------------");
        Task7 sevenTask = new Task7();
        sevenTask.fourSquareMatrix();
        trainingIO.printing("--------------------------------------------Task 8-----------------------------------------");
        Task8 eightTask = new Task8();
        eightTask.columnChange();
        trainingIO.printing("--------------------------------------------Task 9-----------------------------------------");
        Task9 nineTask = new Task9();
        nineTask.maxColumnSum();
        trainingIO.printing("--------------------------------------------Task 10-----------------------------------------");
        Task10 tenTask = new Task10();
        tenTask.positiveNumbersOfMatrixDiagonal();
        trainingIO.printing("\n--------------------------------------------Task 11-----------------------------------------");
        Task11 elevenTask = new Task11();
        elevenTask.sumOfLineWithFiveMoreThenThreeTime();
        trainingIO.printing("--------------------------------------------Task 12-----------------------------------------");
        Task12 twelveTask = new Task12();
        twelveTask.sortedMatrix();
        trainingIO.printing("--------------------------------------------Task 13-----------------------------------------");
        Task13 thirteenthTask = new Task13();
        thirteenthTask.sortedColumnOfMatrix();
        trainingIO.printing("--------------------------------------------Task 14-----------------------------------------");
        Task14 fourteenthTask = new Task14();
        fourteenthTask.randomMatrixMN();
        trainingIO.printing("--------------------------------------------Task 15-----------------------------------------");
        Task15 fifteenthTask = new Task15();
        fifteenthTask.maxElementChanging();
        trainingIO.printing("--------------------------------------------Task 16-----------------------------------------");
        Task16 sixteenthTask = new Task16();
        sixteenthTask.magicSquare();
        trainingIO.printing("--------------------------------------------End-----------------------------------------");

    }

    public void startingAutomatically() {
        trainingIO.printing("--------------------------------------------Task 1-----------------------------------------");
        Task1 firstTask = new Task1();
        firstTask.oddBiggerPrint(5);
        trainingIO.printing("\n--------------------------------------------Task 2-----------------------------------------");
        Task2 secondTaskVariantTwo = new Task2();
        secondTaskVariantTwo.diagonalPrint(5);
        trainingIO.printing("\n--------------------------------------------Task 3-----------------------------------------");
        Task3 thirdTask = new Task3();
        thirdTask.kColumnPrint(5, 2, 3);
        trainingIO.printing("\n--------------------------------------------Task 4-----------------------------------------");
        Task4 fourTask = new Task4();
        fourTask.firstSquareMatrix(6);
        trainingIO.printing("\n--------------------------------------------Task 5-----------------------------------------");
        Task5 fiveTask = new Task5();
        fiveTask.secondSquareMatrix(6);
        trainingIO.printing("\n--------------------------------------------Task 6-----------------------------------------");
        Task6 sixTask = new Task6();
        sixTask.thirdSquareMatrix(6);
        trainingIO.printing("\n--------------------------------------------Task 7-----------------------------------------");
        Task7 sevenTask = new Task7();
        sevenTask.fourSquareMatrix(5);
        trainingIO.printing("\n--------------------------------------------Task 8-----------------------------------------");
        Task8 eightTask = new Task8();
        eightTask.columnChange(2, 3);
        trainingIO.printing("\n--------------------------------------------Task 9-----------------------------------------");
        Task9 nineTask = new Task9();
        nineTask.maxColumnSum(5);
        trainingIO.printing("\n--------------------------------------------Task 10-----------------------------------------");
        Task10 tenTask = new Task10();
        tenTask.positiveNumbersOfMatrixDiagonal(5);
        trainingIO.printing("\n--------------------------------------------Task 11-----------------------------------------");
        Task11 elevenTask = new Task11();
        elevenTask.sumOfLineWithFiveMoreThenThreeTime();
        trainingIO.printing("\n--------------------------------------------Task 12-----------------------------------------");
        Task12 twelveTask = new Task12();
        twelveTask.sortedMatrix(5);
        trainingIO.printing("\n--------------------------------------------Task 13-----------------------------------------");
        Task13 thirteenthTask = new Task13();
        thirteenthTask.sortedColumnOfMatrix(5);
        trainingIO.printing("\n--------------------------------------------Task 14-----------------------------------------");
        Task14 fourteenthTask = new Task14();
        fourteenthTask.randomMatrixMN(5);
        trainingIO.printing("\n--------------------------------------------Task 15-----------------------------------------");
        Task15 fifteenthTask = new Task15();
        fifteenthTask.maxElementChanging(5);
        trainingIO.printing("\n--------------------------------------------Task 16-----------------------------------------");
        Task16 sixteenthTask = new Task16();
        sixteenthTask.magicSquare(4);
        trainingIO.printing("--------------------------------------------End-----------------------------------------");

    }
}
