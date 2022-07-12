package by.introduction_to_java_online.main.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrainingIO {
    public String input() {
        String str = null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            str = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }

    public void printing(String str) {
        System.out.println(str);
    }

    public void printingToTheSameLine(String str) {
        System.out.print(str);
    }

    public void printingError(String str) {
        System.err.println(str);
    }
}
