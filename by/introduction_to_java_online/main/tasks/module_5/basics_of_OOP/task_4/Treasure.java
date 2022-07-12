package by.introduction_to_java_online.main.tasks.module_5.basics_of_OOP.task_4;

public class Treasure {
    private String title;
    private double cost;
    private double amount;

    public Treasure() {
        this.title = null;
        this.cost = 0;
        this.amount = 0;
    }

    public Treasure(String title, double cost, double amount) {
        this.title = title;
        this.cost = cost;
        this.amount = amount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Treasure treasure = (Treasure) o;

        if (Double.compare(treasure.cost, cost) != 0) return false;
        if (Double.compare(treasure.amount, amount) != 0) return false;
        return title != null ? title.equals(treasure.title) : treasure.title == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = title != null ? title.hashCode() : 0;
        temp = Double.doubleToLongBits(cost);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(amount);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Treasure{" +
                "title='" + title + '\'' +
                ", cost=" + cost +
                ", amount=" + amount +
                '}';
    }
}
