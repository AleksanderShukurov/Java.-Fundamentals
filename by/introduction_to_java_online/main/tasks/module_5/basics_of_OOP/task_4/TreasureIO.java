package by.introduction_to_java_online.main.tasks.module_5.basics_of_OOP.task_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TreasureIO {
    public void print(Treasure[] treasures) {
        if (treasures.length == 0) {
            System.err.println("Array of treasure size is null!");
        } else {
            for (Treasure treasure : treasures
            ) {
                System.out.println(treasure.toString());
            }
        }
    }

    public void print(Treasure treasures) {
        System.out.println(treasures);
    }

    public void print(String str) {
        System.out.print(str);
    }

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
}
