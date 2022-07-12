package by.introduction_to_java_online.main.tasks.module_5.basics_of_OOP.task_5;

import by.introduction_to_java_online.main.tasks.module_5.basics_of_OOP.task_5.flowers.*;

import java.util.ArrayList;

public class FlowerCompositionMenu {
    //fabric pattern
    public Flower addFlower(int a) {
        Flower flower = null;
        if (a == 1) {
            flower = new Chamomile();
        } else if (a == 2) {
            flower = new Rose();
        } else if (a == 3) {
            flower = new Iris();
        } else if (a == 4) {
            flower = new Chrysanthemum();
        } else if (a == 5) {
            flower = new Lily();
        }
        return flower;
    }

    public void menu() {
        FlowerIO flowerIO = new FlowerIO();
        FlowerComposition flowerComposition = null;
        Package aPackage = new Package();
        ArrayList<Flower> flowers = new ArrayList<>();
        FlowerCompositionMenu flowerCompositionLogic = new FlowerCompositionMenu();
        boolean processing = true;
        while (processing) {
            flowerIO.print("\n1. Add chamomile; \n2. Add rose; \n3. Add iris; \n4. Add chrysanthemum; \n5. Add lily; \n6. Add package; \n7. End configuration of the composition.");
            flowerIO.print("\nEnter your choose:\n>>>");
            int choose = Integer.parseInt(flowerIO.input());
            if (choose >= 1 & choose <= 5) {
                flowerIO.print("How much flowers need to add to the Composition?\n>>>");
                int amount = Integer.parseInt(flowerIO.inputNumberOfTheFlowers());
                for (int i = 0; i < amount; i++) {
                    flowers.add(flowerCompositionLogic.addFlower(choose));
                }
            } else if (choose == 6) {
                flowerIO.print("Enter color of the package:\n>>>");
                String color = flowerIO.inputColorChecking();
                aPackage = new Package(color);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
            }
            if (choose == 7) {
                flowerIO.print("Exit from the program.\n");
                flowerComposition = new FlowerComposition(flowers.toArray(new Flower[0]), aPackage);
                processing = false;
            }

        }
        flowerIO.print("Printing information about flower composition.\n");
        flowerIO.print(flowerComposition);
    }
}

