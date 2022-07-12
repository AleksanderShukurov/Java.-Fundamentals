package by.introduction_to_java_online.main.tasks.module_4.aggregation_and_composition.task_2;

/*
Условие:
Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться, менять колесо, вывести
на консоль марку автомобиля.
 */

import by.introduction_to_java_online.main.tasks.TrainingIO;

public class Automobile {
    private String carBrand;
    private String carModel;
    private double currentFuelVolume;
    private double tankVolume;
    private Wheel[] wheels;
    private Engine engine;
    private boolean carDriving;
    TrainingIO trainingIO = new TrainingIO();

    public boolean isCarDriving() {
        return carDriving;
    }

    public void setCarDriving(boolean carDriving) {
        this.carDriving = carDriving;
    }

    public double getTankVolume() {
        return tankVolume;
    }

    public void setTankVolume(double tankVolume) {
        this.tankVolume = tankVolume;
    }

    public double getCurrentFuelVolume() {
        return currentFuelVolume;
    }

    public void setCurrentFuelVolume(double currentFuelVolume) {
        this.currentFuelVolume = currentFuelVolume;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public Automobile() {
    }

    public Automobile(String carBrand, String carModel, double currentFuelVolume, double tankVolume, Wheel[] wheels, Engine engine, boolean carDriving) {
        this.carBrand = carBrand;
        this.currentFuelVolume = currentFuelVolume;
        this.tankVolume = tankVolume;
        this.wheels = wheels;
        this.engine = engine;
        this.carDriving = carDriving;
        this.carModel = carModel;
    }

    public void driveCar() {
        if (this.isCarDriving() == false) {


            trainingIO.printing("Car " + this.getCarBrand() + " is start riding.");
            this.carDriving = true;
        } else {
            trainingIO.printing("Car " + this.getCarBrand() + " is already riding.");
        }
    }

    public void fillingTheTank() {
        trainingIO.printing("Volume of the fuel of the " + this.carBrand + " before filling the tank is " + this.getCurrentFuelVolume());
        if (this.currentFuelVolume == this.tankVolume) {
            trainingIO.printing("Fuel tank is full! It doesn't need to fill the tank.");
        } else {
            trainingIO.printing("Volume of the fuel need to be filled is " + (this.tankVolume - this.currentFuelVolume));
            this.currentFuelVolume = this.tankVolume;
        }
    }

    public void wheelChange(int idOfTheWheel) {
        this.wheels[idOfTheWheel - 1].setType("Stepney");
        this.wheels[idOfTheWheel - 1].setNumberOfWheel(5);
    }

    public void carBrandPrinting() {
        trainingIO.printing("Brand of the car is " + this.getCarBrand() + ". Model of the car is " + this.getCarModel() + ".");
    }
}


