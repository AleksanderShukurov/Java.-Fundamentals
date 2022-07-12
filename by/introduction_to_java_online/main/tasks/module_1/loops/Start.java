package by.introduction_to_java_online.main.tasks.module_1.loops;

import by.introduction_to_java_online.main.tasks.TrainingIO;

public class Start {
    TrainingIO trainingIO = new TrainingIO();

    public void startingLoopProgramsManual() {
        trainingIO.printing("--------------------------------------------Task 1-----------------------------------------");
        Task1 firstTask = new Task1();
        firstTask.addCalc();
        trainingIO.printing("--------------------------------------------Task 2-----------------------------------------");
        Task2 secondTask = new Task2();
        secondTask.sectionStepCalc(1, 7, 2);
        trainingIO.printing("--------------------------------------------Task 3-----------------------------------------");
        Task3 thirdTask = new Task3();
        thirdTask.addThousand();
        trainingIO.printing("--------------------------------------------Task 4-----------------------------------------");
        Task4 fourTask = new Task4();
        fourTask.multiPower();
        trainingIO.printing("--------------------------------------------Task 5-----------------------------------------");
        Task5 fiveTask = new Task5();
        fiveTask.numberSeries();
        trainingIO.printing("--------------------------------------------Task 6-----------------------------------------");
        Task6 sixTask = new Task6();
        sixTask.aSCII();
        trainingIO.printing("--------------------------------------------Task 7-----------------------------------------");
        Task7 sevenTask = new Task7();
        sevenTask.integersCheck();
        trainingIO.printing("--------------------------------------------Task 8-----------------------------------------");
        Task8 eightTask = new Task8();
        eightTask.numberIn();
        trainingIO.printing("\n--------------------------------------------End-----------------------------------------");
    }

    public void startingLoopProgramsAutomatically() {
        trainingIO.printing("--------------------------------------------Task 1-----------------------------------------");
        Task1 firstTask = new Task1();
        firstTask.addCalc(8);
        trainingIO.printing("--------------------------------------------Task 2-----------------------------------------");
        Task2 secondTask = new Task2();
        secondTask.sectionStepCalc(1, 7, 2);
        trainingIO.printing("--------------------------------------------Task 3-----------------------------------------");
        Task3 thirdTask = new Task3();
        thirdTask.addThousand();
        trainingIO.printing("--------------------------------------------Task 4-----------------------------------------");
        Task4 fourTask = new Task4();
        fourTask.multiPower();
        trainingIO.printing("--------------------------------------------Task 5-----------------------------------------");
        Task5 fiveTask = new Task5();
        fiveTask.numberSeries(0.6);
        trainingIO.printing("--------------------------------------------Task 6-----------------------------------------");
        Task6 sixTask = new Task6();
        sixTask.aSCII();
        trainingIO.printing("--------------------------------------------Task 7-----------------------------------------");
        Task7 sevenTask = new Task7();
        sevenTask.integersCheck(2, 10);
        trainingIO.printing("--------------------------------------------Task 8-----------------------------------------");
        Task8 eightTask = new Task8();
        eightTask.numberIn(247, 3456);
        trainingIO.printing("\n--------------------------------------------End-----------------------------------------");
    }
}
