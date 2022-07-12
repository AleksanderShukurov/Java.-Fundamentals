package by.introduction_to_java_online.main.tasks.module_1.branching;

import by.introduction_to_java_online.main.tasks.TrainingIO;

public class Start {
    TrainingIO trainingIO = new TrainingIO();

    public void startingBranchingPrograms() {
        trainingIO.printing("--------------------------------------------Task 1-----------------------------------------");
        Task1 firstTask = new Task1();
        firstTask.didTriangleExist(95, 85);
        trainingIO.printing("--------------------------------------------Task 2-----------------------------------------");
        Task2 secondTask = new Task2();
        secondTask.maxMinCalc(6, 7, 4, 5);
        trainingIO.printing("--------------------------------------------Task 3-----------------------------------------");
        Task3 thirdTask = new Task3();
        trainingIO.printing("Are three points lying on one line? " + thirdTask.threePointOneLineDetection(3, 2, 10, 9, 13, 12));
        trainingIO.printing("--------------------------------------------Task 4-----------------------------------------");
        Task4 fourTask = new Task4();
        fourTask.didHoleEnough(10, 10, 25, 10, 20);
        trainingIO.printing("--------------------------------------------Task 5-----------------------------------------");
        Task5 fiveTask = new Task5();
        fiveTask.functionCalculation(4);
        trainingIO.printing("--------------------------------------------End-----------------------------------------");
    }
}
