package java20.Task04_02;

/**
 * Задание №4_2
 *
 * @author Marenkov
 */

public class Jellybean extends Sweets {
    private String shape;

    public Jellybean(String name, Double weight, Double price, String shape) {
        super(name, weight, price);
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "Мармелад [" + super.toString() + ", shape = " + shape + "]";
    }
}
