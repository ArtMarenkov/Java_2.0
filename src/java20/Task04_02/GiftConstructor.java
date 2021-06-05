package java20.Task04_02;

/**
 * Задание №4_2
 *
 * @author Marenkov
 */

import java.util.ArrayList;
import java.util.List;

public class GiftConstructor {
    private List<Sweet> sweets = new ArrayList<>();

    public void addSweetToGift(Sweet sweet) {
        sweets.add(sweet);
    }

    public List<Sweet> getGift() {
        return sweets;
    }

    public double getTotalWeight() {
        double sumweight = 0.0;
        for (Sweet sweet : sweets) {
            sumweight += sweet.getWeight();
        }
        return sumweight;
    }

    public double getTotalCost() {
        double sumcost = 0.0;
        for (Sweet sweet : sweets) {
            sumcost += sweet.getCost();
        }
        return sumcost;
    }
}