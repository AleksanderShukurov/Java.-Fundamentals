package by.introduction_to_java_online.main.tasks.module_4.aggregation_and_composition.task_3;

public class Region {
    private String name;
    private District[] districts;
    private long population;
    private long area;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public District[] getDistricts() {
        return districts;
    }

    public void setDistricts(District[] districts) {
        this.districts = districts;
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

    public Region() {
    }

    public Region(String name, District[] districts) {
        this.name = name;
        this.districts = districts;
        this.population = 0;
        for (District district : districts) {
            this.population += district.getPopulation();
        }
        this.area = 0;
        for (int i = 0; i < districts.length; i++) {
            this.area += districts[i].getArea();
        }
    }
}
