package by.introduction_to_java_online.main.tasks.module_5.basics_of_OOP.task_5;

public class Package {
    private final String COLOR;

    public Package() {
        this.COLOR = null;
    }

    public Package(String color) {
        this.COLOR = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Package aPackage = (Package) o;

        return COLOR != null ? COLOR.equals(aPackage.COLOR) : aPackage.COLOR == null;
    }

    @Override
    public int hashCode() {
        return COLOR != null ? COLOR.hashCode() : 0;
    }

    @Override
    public String toString() {
        return COLOR;
    }
}

