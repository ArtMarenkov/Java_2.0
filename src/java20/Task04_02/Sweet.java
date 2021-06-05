package java20.Task04_02;

/**
 * Задание №4_2
 *
 * @author Marenkov
 */

public class Sweet {
    private String name;
    private double weight;
    private double cost;
    private String taste;

    public Sweet(String name, double weight, double cost, String taste) {
        this.name = name;
        this.weight = weight;
        this.cost = cost;
        this.taste = taste;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getCost() {
        return cost;
    }

    public String getTaste() {
        return taste;
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", weight=" + weight +
                ", cost=" + cost +
                ", taste='" + taste + '\'';
    }
}