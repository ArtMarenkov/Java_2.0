package java20.Task04_02;

/**
 * Задание №4_2
 *
 * @author Marenkov
 */

public class Chocolate extends Sweets {

    private String country;

    public Chocolate(String name, Double weight, Double price, String country) {
        super(name, weight, price);
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {

        return "Шоколад [" + super.toString() + ", country = " + country + "]";
    }
}
