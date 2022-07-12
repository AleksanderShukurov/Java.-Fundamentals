package by.introduction_to_java_online.main.tasks.module_2.one_dimensional_array_sorting;

import by.introduction_to_java_online.main.tasks.TrainingIO;

public class Start {
    TrainingIO trainingIO = new TrainingIO();

    public void startingManual() {
        trainingIO.printing("\n--------------------------------------------Task 1-----------------------------------------");
        Task1 firstTask = new Task1();
        firstTask.arrayUnion();
        trainingIO.printing("\n--------------------------------------------Task 2-----------------------------------------");
        Task2 secondTask = new Task2();
        secondTask.arrayUnionUp();
        trainingIO.printing("\n--------------------------------------------Task 3-----------------------------------------");
        Task3 thirdTask = new Task3();
        thirdTask.sortingByChose();
        trainingIO.printing("\n--------------------------------------------Task 4-----------------------------------------");
        Task4 fourTask = new Task4();
        fourTask.sortingBySwap();
        trainingIO.printing("\n--------------------------------------------Task 5-----------------------------------------");
        Task5 fiveTask = new Task5();
        fiveTask.sortingByInsertion();
        trainingIO.printing("\n--------------------------------------------Task 6-----------------------------------------");
        Task6 sixTask = new Task6();
        sixTask.shellSorting();
        trainingIO.printing("\n--------------------------------------------Task 7-----------------------------------------");
        Task7 seventhTask = new Task7();
        seventhTask.twoArrayCombining();
        trainingIO.printing("\n--------------------------------------------Task 8-----------------------------------------");
        Task8 eighthTask = new Task8();
        eighthTask.orderingOfFractions();
        trainingIO.printing("\n--------------------------------------------End-----------------------------------------");

    }

    public void startingAutomatically() {
        trainingIO.printing("\n--------------------------------------------Task 1-----------------------------------------");
        Task1 firstTask = new Task1();
        firstTask.arrayUnion(5, 7, 3);
        trainingIO.printing("\n--------------------------------------------Task 2-----------------------------------------");
        Task2 secondTask = new Task2();
        secondTask.arrayUnionUp(5, 6);
        trainingIO.printing("\n--------------------------------------------Task 3-----------------------------------------");
        Task3 thirdTask = new Task3();
        thirdTask.sortingByChose();
        trainingIO.printing("\n--------------------------------------------Task 4-----------------------------------------");
        Task4 fourTask = new Task4();
        fourTask.sortingBySwap();
        trainingIO.printing("\n--------------------------------------------Task 5-----------------------------------------");
        Task5 fiveTask = new Task5();
        fiveTask.sortingByInsertion();
        trainingIO.printing("\n--------------------------------------------Task 6-----------------------------------------");
        Task6 sixTask = new Task6();
        sixTask.shellSorting();
        trainingIO.printing("\n--------------------------------------------Task 7-----------------------------------------");
        Task7 seventhTask = new Task7();
        seventhTask.twoArrayCombining(4, 5);
        trainingIO.printing("\n--------------------------------------------Task 8-----------------------------------------");
        Task8 eighthTask = new Task8();
        eighthTask.orderingOfFractions();
        trainingIO.printing("\n--------------------------------------------End-----------------------------------------");

    }
}
