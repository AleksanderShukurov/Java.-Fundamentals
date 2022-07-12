package by.introduction_to_java_online.main.tasks.module_4.aggregation_and_composition.task_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TravelVoucherIO {
    public String input() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        try {
            str = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}
