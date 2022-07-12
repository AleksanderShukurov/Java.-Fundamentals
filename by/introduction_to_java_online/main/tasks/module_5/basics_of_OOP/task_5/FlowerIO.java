package by.introduction_to_java_online.main.tasks.module_5.basics_of_OOP.task_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FlowerIO {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public String input() {
        String str = null;
        try {
            str = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }

    public String inputColorChecking() {
        Pattern pattern = Pattern.compile("[a-z+]");
        String str = null;
        try {
            str = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return str;
        } else {
            System.err.println("Error input color, default color set to white!");
            return "White";
        }
    }

    public String inputNumberOfTheFlowers() {
        Pattern pattern = Pattern.compile("[\\d]");
        String amount = null;
        try {
            amount = (reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        Matcher matcher = pattern.matcher(amount);
        if (matcher.find()) {
            return amount;
        } else {
            System.err.println("Error input amount of the flowers, default amount set to one!");
            return "1";
        }
    }

    public void print(String str) {
        System.out.print(str);
    }

    public void print(FlowerComposition flowerComposition) {
        int i = 1;
        for (Flower flower : flowerComposition.getFlower()
        ) {
            print("Flower number " + i + " is a " + flower.getColour() + " " + flower.getName() + ";\n");
            i++;
        }
        print("Package is " + flowerComposition.getaPackage().toString() + ".");
    }
}
