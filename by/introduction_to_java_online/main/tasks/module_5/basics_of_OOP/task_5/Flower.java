package by.introduction_to_java_online.main.tasks.module_5.basics_of_OOP.task_5;

public abstract class Flower {
    private String name;
    private String colour;

    public Flower() {
    }

    public Flower(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flower flower = (Flower) o;

        if (name != null ? !name.equals(flower.name) : flower.name != null) return false;
        return colour != null ? colour.equals(flower.colour) : flower.colour == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (colour != null ? colour.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}


