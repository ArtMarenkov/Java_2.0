package java20.Task04_02;

/**
 * Задание №4_2
 *
 * @author Marenkov
 */

public class Candy extends Sweets {
    private String taste;

    public Candy(String name, Double weight, Double price, String taste) {
        super(name, weight, price);
        this.taste = taste;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    @Override
    public String toString() {
        return "Конфеты  [" + super.toString() + ", taste = " + taste + "]";
    }
}