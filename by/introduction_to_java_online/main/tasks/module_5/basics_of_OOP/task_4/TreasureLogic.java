package by.introduction_to_java_online.main.tasks.module_5.basics_of_OOP.task_4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TreasureLogic {
    public Treasure[] makeObjectsFromTXTFile() {
        ArrayList<Treasure> treasures = new ArrayList<>();

        try {
            FileReader fileReader = new FileReader("C:\\Users\\tryha\\IdeaProjects\\Java0Tutor.Strings_and_basics_of_text_processing\\src\\basic_of_oop\\task_1\\task_4\\treasures.txt");
            BufferedReader reader = new BufferedReader(fileReader);
            String line = reader.readLine();
            int i = 0;
            Pattern pattern = Pattern.compile("(.+),\s(.+),\s(.+)");

            while (line != null) {
                Matcher matcher = pattern.matcher(line);
                if (matcher.find()) {
                    treasures.add(new Treasure(matcher.group(1), Double.parseDouble(matcher.group(2)), Double.parseDouble(matcher.group(3))));
                }
                line = reader.readLine();
                i++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return treasures.toArray(new Treasure[0]);
    }

    public Treasure returningMostExpensiveTreasure(Treasure[] treasures) {
        int mostExpensiveTreasureIndex = 0;
        for (int i = 1; i < treasures.length; i++) {
            if (treasures[i].getCost() > mostExpensiveTreasureIndex) {
                mostExpensiveTreasureIndex = i;
            }
        }
        return treasures[mostExpensiveTreasureIndex];
    }

    public Treasure[] returningTreasuresForEnteredCost(Treasure[] treasures) {
        ArrayList<Treasure> newTreasure = new ArrayList<>();
        TreasureIO treasureIO = new TreasureIO();
        treasureIO.print("Enter summary cost of the treasure:");
        double summaryCost = Double.parseDouble(treasureIO.input());
        double tempCost = 0;
        for (Treasure treasure : treasures) {
            if ((tempCost + (treasure.getCost() * treasure.getAmount())) < summaryCost) {
                newTreasure.add(treasure);
                tempCost += (treasure.getCost() * treasure.getAmount());
            }
        }

        if (newTreasure.size() == 0) {
            treasureIO.print("No one matches for entered cost\n");
        }
        treasureIO.print("Total cost is " + tempCost + "\n");
        return newTreasure.toArray(new Treasure[0]);
    }

    public void menu() {
        TreasureLogic treasureLogic = new TreasureLogic();
        TreasureIO treasureIO = new TreasureIO();
        Treasure[] treasures = treasureLogic.makeObjectsFromTXTFile();
        boolean processing = true;
        while (processing) {
            treasureIO.print("1. Print all treasures.  \n2. Print the most expensive treasure. \n3. Print all treasures for entered cost. \n4. Exit \n>>>");
            int chose = Integer.parseInt(treasureIO.input());
            if (chose == 1) {
                treasureIO.print("Printing all treasures:");
                treasureIO.print(treasures);
            } else if (chose == 2) {
                treasureIO.print("Printing most expensive treasure:");
                treasureIO.print(treasureLogic.returningMostExpensiveTreasure(treasures));
            } else if (chose == 3) {
                treasureIO.print("Printing all treasure, that summary cost less than input.");
                treasureIO.print(treasureLogic.returningTreasuresForEnteredCost(treasures));
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
            } else if (chose == 4) {
                treasureIO.print("Exit from the program.");
                processing = false;
            }
        }
    }
}

