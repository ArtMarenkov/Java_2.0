package java20.Task04_02;

/**
 * Задание №4_2
 *
 * @author Marenkov
 */

import java.util.ArrayList;
import java.util.List;

public abstract class Sweets {

    private String name;
    private Double weight;
    private Double price;



    public Sweets(String name, Double weight, Double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return  "название = " + name +
                ", масса, (гр.) = " + weight +
                ", цена, (руб.) = " + price;
    }
}