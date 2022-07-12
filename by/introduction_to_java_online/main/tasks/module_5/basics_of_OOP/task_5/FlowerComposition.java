package by.introduction_to_java_online.main.tasks.module_5.basics_of_OOP.task_5;

public class FlowerComposition {
    private Flower[] flower;
    private Package aPackage;

    public FlowerComposition(Flower[] flower, Package aPackage) {
        this.flower = flower;
        this.aPackage = aPackage;
    }

    public Flower[] getFlower() {
        return flower;
    }

    public void setFlower(Flower[] flower) {
        this.flower = flower;
    }

    public Package getaPackage() {
        return aPackage;
    }

    public void setaPackage(Package aPackage) {
        this.aPackage = aPackage;
    }
}
