package by.introduction_to_java_online.main.tasks.module_5.basics_of_OOP;

import by.introduction_to_java_online.main.tasks.TrainingIO;
import by.introduction_to_java_online.main.tasks.module_5.basics_of_OOP.task_1.StartText;
import by.introduction_to_java_online.main.tasks.module_5.basics_of_OOP.task_2.StartPayment;
import by.introduction_to_java_online.main.tasks.module_5.basics_of_OOP.task_3.StartCalendar;
import by.introduction_to_java_online.main.tasks.module_5.basics_of_OOP.task_4.StartTreasure;
import by.introduction_to_java_online.main.tasks.module_5.basics_of_OOP.task_5.StartFlowerComposition;

public class Start {
    TrainingIO trainingIO = new TrainingIO();

    public void startingAutomatically() {
        trainingIO.printing("\n--------------------------------------------Task 1-----------------------------------------");
        StartText startText = new StartText();
        startText.startingTextProgram();
        trainingIO.printing("\n--------------------------------------------Task 2-----------------------------------------");
        StartPayment startPayment = new StartPayment();
        startPayment.paymentStarting();
        trainingIO.printing("\n--------------------------------------------Task 3-----------------------------------------");
        StartCalendar startCalendar = new StartCalendar();
        startCalendar.calendarStarting();
        trainingIO.printing("\n--------------------------------------------Task 4-----------------------------------------");
        StartTreasure startTreasure = new StartTreasure();
        startTreasure.treasureStarting();
        trainingIO.printing("\n--------------------------------------------Task 5-----------------------------------------");
        StartFlowerComposition startFlowerComposition = new StartFlowerComposition();
        startFlowerComposition.flowerCompositionStaring();
        trainingIO.printing("\n--------------------------------------------End-----------------------------------------");
    }
}
