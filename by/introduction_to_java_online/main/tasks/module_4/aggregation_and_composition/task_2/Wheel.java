package by.introduction_to_java_online.main.tasks.module_4.aggregation_and_composition.task_2;

public class Wheel {
    private double width;
    private double height;
    private double diameter;
    private String type;
    private String season;
    public int numberOfWheel;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public int getNumberOfWheel() {
        return numberOfWheel;
    }

    public void setNumberOfWheel(int numberOfWheel) {
        this.numberOfWheel = numberOfWheel;
    }

    public Wheel() {
    }

    public Wheel(double width, double height, double diameter, String type, String season, int numberOfWheel) {
        this.width = width;
        this.height = height;
        this.diameter = diameter;
        this.type = type;
        this.season = season;
        this.numberOfWheel = numberOfWheel;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "width=" + width +
                ", height=" + height +
                ", diameter=" + diameter +
                ", type='" + type + '\'' +
                ", season='" + season + '\'' +
                ", numberOfWheel=" + numberOfWheel +
                '}';
    }
}
