package by.introduction_to_java_online.main.tasks.module_4.aggregation_and_composition.task_3;

public class District {
    private String name;
    private City[] cities;
    private long population;
    private long area;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City[] getCities() {
        return cities;
    }

    public void setCities(City[] cities) {
        this.cities = cities;
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

    public District() {
    }

    public District(String name, City[] cities, long area) {
        this.name = name;
        this.cities = cities;
        this.population = 0;
        for (City city : cities) {
            this.population += city.getCityPopulation();
        }
        this.area = area;
    }
}
