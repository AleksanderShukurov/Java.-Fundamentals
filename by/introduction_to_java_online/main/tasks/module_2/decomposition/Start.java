package by.introduction_to_java_online.main.tasks.module_2.decomposition;

import by.introduction_to_java_online.main.tasks.TrainingIO;
import by.introduction_to_java_online.main.tasks.module_2.decomposition.task_1.Task1;
import by.introduction_to_java_online.main.tasks.module_2.decomposition.task_10.Task10;
import by.introduction_to_java_online.main.tasks.module_2.decomposition.task_11.Task11;
import by.introduction_to_java_online.main.tasks.module_2.decomposition.task_12.ArrayPrint;
import by.introduction_to_java_online.main.tasks.module_2.decomposition.task_12.Task12;
import by.introduction_to_java_online.main.tasks.module_2.decomposition.task_13.Task13;
import by.introduction_to_java_online.main.tasks.module_2.decomposition.task_14.Task14;
import by.introduction_to_java_online.main.tasks.module_2.decomposition.task_15.Task15;
import by.introduction_to_java_online.main.tasks.module_2.decomposition.task_16.Task16;
import by.introduction_to_java_online.main.tasks.module_2.decomposition.task_17.Task17;
import by.introduction_to_java_online.main.tasks.module_2.decomposition.task_2.Task2;
import by.introduction_to_java_online.main.tasks.module_2.decomposition.task_3.Task3;
import by.introduction_to_java_online.main.tasks.module_2.decomposition.task_4.Task4;
import by.introduction_to_java_online.main.tasks.module_2.decomposition.task_5.Task5;
import by.introduction_to_java_online.main.tasks.module_2.decomposition.task_6.Task6;
import by.introduction_to_java_online.main.tasks.module_2.decomposition.task_7.Task7;
import by.introduction_to_java_online.main.tasks.module_2.decomposition.task_8.Task8;
import by.introduction_to_java_online.main.tasks.module_2.decomposition.task_9.Task9;

public class Start {
    TrainingIO trainingIO = new TrainingIO();
    ArrayPrint arrayPrint = new ArrayPrint();

    public void startingManual() {
        trainingIO.printing("\n--------------------------------------------Task 1-----------------------------------------");
        Task1 firstTask = new Task1();
        firstTask.startTask1(new int[]{27, 36});
        trainingIO.printing("\n--------------------------------------------Task 2-----------------------------------------");
        Task2 secondTask = new Task2();
        secondTask.startTask2();
        trainingIO.printing("\n--------------------------------------------Task 3-----------------------------------------");
        Task3 thirdTask = new Task3();
        thirdTask.startTask3();
        trainingIO.printing("\n--------------------------------------------Task 4-----------------------------------------");
        Task4 fourthTask = new Task4();
        fourthTask.startTask4(new int[][]{{1, 2}, {3, 2}, {4, 1}, {-22, -18}, {33, 42}});
        trainingIO.printing("\n--------------------------------------------Task 5-----------------------------------------");
        Task5 fifthTask = new Task5();
        fifthTask.startTask5(new int[]{1, 4, 6, 8, 12, 45, 36, 8, 2, 15, 38});
        trainingIO.printing("\n--------------------------------------------Task 6-----------------------------------------");
        Task6 sixthTask = new Task6();
        sixthTask.checkingPrimeNumber();
        trainingIO.printing("\n--------------------------------------------Task 7-----------------------------------------");
        Task7 seventhTask = new Task7();
        seventhTask.startTask7();
        trainingIO.printing("\n--------------------------------------------Task 8-----------------------------------------");
        Task8 eighthTask = new Task8();
        eighthTask.sumOfThreeNumbersCalculation();
        trainingIO.printing("\n--------------------------------------------Task 9-----------------------------------------");
        Task9 ninthTask = new Task9();
        ninthTask.startTask9();
        trainingIO.printing("\n--------------------------------------------Task 10-----------------------------------------");
        Task10 tenthTask = new Task10();
        arrayPrint.arrayPrinting(tenthTask.formingAnArrayOfDigitsFromANumber());
        trainingIO.printing("\n--------------------------------------------Task 11-----------------------------------------");
        Task11 eleventhTask = new Task11();
        eleventhTask.lengthOfDigitsComparison();
        trainingIO.printing("\n--------------------------------------------Task 12-----------------------------------------");
        Task12 twelfthTask = new Task12();
        twelfthTask.arrayForming();
        trainingIO.printing("\n--------------------------------------------Task 13-----------------------------------------");
        Task13 thirteenthTask = new Task13();
        thirteenthTask.twinsDetection();
        trainingIO.printing("\n--------------------------------------------Task 14-----------------------------------------");
        Task14 fourteenthTask = new Task14();
        fourteenthTask.searchForArmstrongNumbers();
        trainingIO.printing("\n--------------------------------------------Task 15-----------------------------------------");
        Task15 fifteenthTask = new Task15();
        fifteenthTask.ascendingSequenceSearch();
        trainingIO.printing("\n--------------------------------------------Task 16-----------------------------------------");
        Task16 sixteenthTask = new Task16();
        sixteenthTask.SumOfEvenCalculation();
        trainingIO.printing("\n--------------------------------------------Task 17-----------------------------------------");
        Task17 seventeenthTask = new Task17();
        seventeenthTask.numberOfSubtractionsPrinting();
        trainingIO.printing("\n--------------------------------------------End-----------------------------------------");
    }

    public void startingAutomatically() {
        trainingIO.printing("\n--------------------------------------------Task 1-----------------------------------------");
        Task1 firstTask = new Task1();
        firstTask.startTask1(new int[]{27, 36});
        trainingIO.printing("\n--------------------------------------------Task 2-----------------------------------------");
        Task2 secondTask = new Task2();
        secondTask.startTask2();
        trainingIO.printing("\n--------------------------------------------Task 3-----------------------------------------");
        Task3 thirdTask = new Task3();
        thirdTask.startTask3();
        trainingIO.printing("\n--------------------------------------------Task 4-----------------------------------------");
        Task4 fourthTask = new Task4();
        fourthTask.startTask4(new int[][]{{1, 2}, {3, 2}, {4, 1}, {-22, -18}, {33, 42}});
        trainingIO.printing("\n--------------------------------------------Task 5-----------------------------------------");
        Task5 fifthTask = new Task5();
        fifthTask.startTask5(new int[]{1, 4, 6, 8, 12, 45, 36, 8, 2, 15, 38});
        trainingIO.printing("\n--------------------------------------------Task 6-----------------------------------------");
        Task6 sixthTask = new Task6();
        sixthTask.checkingPrimeNumber(11, 13, 17);
        trainingIO.printing("\n--------------------------------------------Task 7-----------------------------------------");
        Task7 seventhTask = new Task7();
        seventhTask.startTask7();
        trainingIO.printing("\n--------------------------------------------Task 8-----------------------------------------");
        Task8 eighthTask = new Task8();
        eighthTask.sumOfThreeNumbersCalculation(5, 6);
        trainingIO.printing("\n--------------------------------------------Task 9-----------------------------------------");
        Task9 ninthTask = new Task9();
        ninthTask.startTask9();
        trainingIO.printing("\n--------------------------------------------Task 10-----------------------------------------");
        Task10 tenthTask = new Task10();
        arrayPrint.arrayPrinting(tenthTask.formingAnArrayOfDigitsFromANumber(3582));
        trainingIO.printing("\n--------------------------------------------Task 11-----------------------------------------");
        Task11 eleventhTask = new Task11();
        eleventhTask.lengthOfDigitsComparison(342, 5746);
        trainingIO.printing("\n--------------------------------------------Task 12-----------------------------------------");
        Task12 twelfthTask = new Task12();
        twelfthTask.arrayForming(12, 76);
        trainingIO.printing("\n--------------------------------------------Task 13-----------------------------------------");
        Task13 thirteenthTask = new Task13();
        thirteenthTask.twinsDetection(96);
        trainingIO.printing("\n--------------------------------------------Task 14-----------------------------------------");
        Task14 fourteenthTask = new Task14();
        fourteenthTask.searchForArmstrongNumbers(1000);
        trainingIO.printing("\n--------------------------------------------Task 15-----------------------------------------");
        Task15 fifteenthTask = new Task15();
        fifteenthTask.ascendingSequenceSearch(4);
        trainingIO.printing("\n--------------------------------------------Task 16-----------------------------------------");
        Task16 sixteenthTask = new Task16();
        sixteenthTask.SumOfEvenCalculation(1357);
        trainingIO.printing("\n--------------------------------------------Task 17-----------------------------------------");
        Task17 seventeenthTask = new Task17();
        seventeenthTask.numberOfSubtractionsPrinting(127);
        trainingIO.printing("\n--------------------------------------------End-----------------------------------------");
    }
}
