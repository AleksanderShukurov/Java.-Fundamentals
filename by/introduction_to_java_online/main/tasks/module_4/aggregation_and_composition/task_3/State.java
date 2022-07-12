package by.introduction_to_java_online.main.tasks.module_4.aggregation_and_composition.task_3;

/*
Условие:
Создать объект класса государства используя классы Область, Район, Город. Методы: вывести на консоль столицу,
количество областей, площадь, областные центры.
 */

import by.introduction_to_java_online.main.tasks.TrainingIO;

public class State {
    private String name;
    private Region[] regions;
    private String capital;
    private long population;
    private long area;
    TrainingIO trainingIO = new TrainingIO();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Region[] getRegions() {
        return regions;
    }

    public void setRegions(Region[] regions) {
        this.regions = regions;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public long getArea() {
        return area;
    }

    public void setArea(long area) {
        this.area = area;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public State() {
    }

    public State(String name, Region[] regions, City capital) {
        this.name = name;
        this.regions = regions;
        this.capital = capital.getCityName();
        this.population = 0;
        for (Region value : regions) {
            for (int j = 0; j < value.getDistricts().length; j++) {
                District[] districts = value.getDistricts();
                this.population += districts[j].getPopulation();
            }
        }
        this.area = 0;
        for (Region region : regions) {
            this.area += region.getArea();
        }
    }

    public void printingCapitalOfTheCountry() {
        trainingIO.printing("Capital of the " + this.getName() + " is " + this.getCapital());
    }

    public void printingNumberOfTheRegions() {
        trainingIO.printing("Number of the regions in the " + this.getName() + " is " + this.getRegions().length);
    }

    public void printingAreaOfTheCountry() {
        trainingIO.printing("Area of the " + this.name + " is " + this.area);
    }

    public void printingTheRegionalCentres() {
        for (Region region : this.regions) {
            trainingIO.printing(region.getName());
        }
    }
}
