package by.introduction_to_java_online.main.tasks.module_2.one_dimensional_array;

import by.introduction_to_java_online.main.tasks.TrainingIO;

public class Start {
    TrainingIO trainingIO = new TrainingIO();

    public void startingManual() {
        trainingIO.printing("--------------------------------------------Task 1-----------------------------------------");
        Task1 firstTask = new Task1();
        firstTask.array();
        trainingIO.printing("--------------------------------------------Task 2-----------------------------------------");
        Task2 secondTask = new Task2();
        secondTask.arrayChange();
        trainingIO.printing("--------------------------------------------Task 3-----------------------------------------");
        Task3 thirdTask = new Task3();
        thirdTask.counter();
        trainingIO.printing("--------------------------------------------Task 4-----------------------------------------");
        Task4 fourTask = new Task4();
        fourTask.maxMinChange();
        trainingIO.printing("--------------------------------------------Task 5-----------------------------------------");
        Task5 fiveTask = new Task5();
        fiveTask.maxDigitPrint();
        trainingIO.printing("--------------------------------------------Task 6-----------------------------------------");
        Task6 sixTask = new Task6();
        sixTask.ifSimplePrint();
        trainingIO.printing("--------------------------------------------Task 7-----------------------------------------");
        Task7 sevenTask = new Task7();
        sevenTask.maxDetect();
        trainingIO.printing("--------------------------------------------Task 8-----------------------------------------");
        Task8 eightTask = new Task8();
        eightTask.deleteMin();
        trainingIO.printing("--------------------------------------------Task 9-----------------------------------------");
        Task9 nineTask = new Task9();
        nineTask.oftenValue();
        trainingIO.printing("--------------------------------------------Task 10-----------------------------------------");
        Task10 tenTask = new Task10();
        tenTask.evenIndexDelete();
        trainingIO.printing("--------------------------------------------End-----------------------------------------");

    }

    public void startingAutomatically() {
        trainingIO.printing("\n--------------------------------------------Task 1-----------------------------------------");
        Task1 firstTask = new Task1();
        firstTask.array(2, 10);
        trainingIO.printing("\n--------------------------------------------Task 2-----------------------------------------");
        Task2 secondTask = new Task2();
        secondTask.arrayChange(4);
        trainingIO.printing("\n--------------------------------------------Task 3-----------------------------------------");
        Task3 thirdTask = new Task3();
        thirdTask.counter(7);
        trainingIO.printing("\n--------------------------------------------Task 4-----------------------------------------");
        Task4 fourTask = new Task4();
        fourTask.maxMinChange();
        trainingIO.printing("\n--------------------------------------------Task 5-----------------------------------------");
        Task5 fiveTask = new Task5();
        fiveTask.maxDigitPrint();
        trainingIO.printing("\n--------------------------------------------Task 6-----------------------------------------");
        Task6 sixTask = new Task6();
        sixTask.ifSimplePrint();
        trainingIO.printing("\n--------------------------------------------Task 7-----------------------------------------");
        Task7 sevenTask = new Task7();
        sevenTask.maxDetect(8);
        trainingIO.printing("\n--------------------------------------------Task 8-----------------------------------------");
        Task8 eightTask = new Task8();
        eightTask.deleteMin(8);
        trainingIO.printing("\n--------------------------------------------Task 9-----------------------------------------");
        Task9 nineTask = new Task9();
        nineTask.oftenValue();
        trainingIO.printing("\n--------------------------------------------Task 10-----------------------------------------");
        Task10 tenTask = new Task10();
        tenTask.evenIndexDelete();
        trainingIO.printing("\n--------------------------------------------End-----------------------------------------");

    }
}
