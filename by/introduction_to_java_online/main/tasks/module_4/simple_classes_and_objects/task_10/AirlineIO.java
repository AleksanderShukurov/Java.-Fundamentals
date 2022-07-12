package by.introduction_to_java_online.main.tasks.module_4.simple_classes_and_objects.task_10;

public class AirlineIO {
    public void airlinePrinting(Airline[] airlines) {
        for (Airline airline : airlines
        ) {
            System.out.println(airline.toString());
        }
    }
}

