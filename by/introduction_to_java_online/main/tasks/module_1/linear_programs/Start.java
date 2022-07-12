package by.introduction_to_java_online.main.tasks.module_1.linear_programs;

import by.introduction_to_java_online.main.tasks.TrainingIO;

public class Start {
    TrainingIO trainingIO = new TrainingIO();

    public void startingLinearProgrammingPrograms() {
        trainingIO.printing("--------------------------------------------Task 1-----------------------------------------");
        Task1 firstTask = new Task1();
        firstTask.funCalc(5, 7, 4);
        trainingIO.printing("--------------------------------------------Task 2-----------------------------------------");
        Task2 secondTask = new Task2();
        secondTask.expressionCalc(5, 7, 4);
        trainingIO.printing("--------------------------------------------Task 3-----------------------------------------");
        Task3 thirdTask = new Task3();
        thirdTask.expressionCalcSinCos(Math.toRadians(30), Math.toRadians(45));
        trainingIO.printing("--------------------------------------------Task 4-----------------------------------------");
        Task4 fourTask = new Task4();
        fourTask.realNumberChange(123.456);
        trainingIO.printing("--------------------------------------------Task 5-----------------------------------------");
        Task5 fiveTask = new Task5();
        fiveTask.timeConvert(3700);
        trainingIO.printing("--------------------------------------------Task 6-----------------------------------------");
        Task6 sixTask = new Task6();
        sixTask.didInclude(1, 1);
        trainingIO.printing("--------------------------------------------End-----------------------------------------");
    }
}
