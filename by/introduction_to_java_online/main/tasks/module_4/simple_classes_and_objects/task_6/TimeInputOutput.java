package by.introduction_to_java_online.main.tasks.module_4.simple_classes_and_objects.task_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TimeInputOutput {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public String inputInformation() {
        String str = null;
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            str = reader.readLine();
        } catch (IOException e) {
            e.getStackTrace();
        }
        return str;
    }

    public void printing(String str) {
        System.err.println(str);
    }

    public void outputInformation(Time time) {
        if (time.getHour() < 10) {
            if (time.getMinute() < 10) {
                if (time.getSeconds() < 10) {
                    System.out.println("Current time is: 0" + time.getHour() + ":0" + time.getMinute() + ":0" + time.getSeconds());
                } else
                    System.out.println("Current time is: 0" + time.getHour() + ":0" + time.getMinute() + ":" + time.getSeconds());
            } else
                System.out.println("Current time is: 0" + time.getHour() + ":" + time.getMinute() + ":" + time.getSeconds());
        } else
            System.out.println("Current time is: " + time.getHour() + ":" + time.getMinute() + ":" + time.getSeconds());
    }
}
