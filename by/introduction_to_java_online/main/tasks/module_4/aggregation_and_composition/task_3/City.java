package by.introduction_to_java_online.main.tasks.module_4.aggregation_and_composition.task_3;

public class City {
    private String cityName;
    private long cityPopulation;

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public long getCityPopulation() {
        return cityPopulation;
    }

    public void setCityPopulation(long cityPopulation) {
        this.cityPopulation = cityPopulation;
    }

    public City() {
    }

    public City(String cityName, long cityPopulation) {
        this.cityName = cityName;
        this.cityPopulation = cityPopulation;
    }
}
