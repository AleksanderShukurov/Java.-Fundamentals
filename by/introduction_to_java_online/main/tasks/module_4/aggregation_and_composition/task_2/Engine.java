package by.introduction_to_java_online.main.tasks.module_4.aggregation_and_composition.task_2;

public class Engine {
    private String typeOfTheFuel;
    private double volumeOfTheEngine;
    private int enginePower;

    public String getTypeOfTheFuel() {
        return typeOfTheFuel;
    }

    public void setTypeOfTheFuel(String typeOfTheFuel) {
        this.typeOfTheFuel = typeOfTheFuel;
    }

    public double getVolumeOfTheEngine() {
        return volumeOfTheEngine;
    }

    public void setVolumeOfTheEngine(double volumeOfTheEngine) {
        this.volumeOfTheEngine = volumeOfTheEngine;
    }

    public Engine() {
    }

    public Engine(String typeOfTheFuel, double volumeOfTheEngine, int enginePower) {
        this.typeOfTheFuel = typeOfTheFuel;
        this.volumeOfTheEngine = volumeOfTheEngine;
        this.enginePower = enginePower;
    }
}
