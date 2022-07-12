package by.introduction_to_java_online.main.tasks.module_4.simple_classes_and_objects.task_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputOutput {
    public void printingTrainInformation(Train... trains) {
        for (Train value : trains) {
            System.out.println("Number of train is: " + value.getTrainNumber() + " the las station of the train is: " +
                    value.getNameOfTheEndStation() + " departure time is: " + value.getDepartureTime().getHour() + ":" + value.getDepartureTime().getMinute() + ":" + value.getDepartureTime().getSeconds());
        }
    }

    public void printing(String str) {
        System.out.println(str);
    }

    public String input() {
        String str = null;
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            str = reader.readLine();
        } catch (IOException e) {
            e.getStackTrace();
        }
        return str;
    }
}
