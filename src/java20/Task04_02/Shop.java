package java20.Task04_02;

/**
 * Задание №4_2
 *
 * @author Marenkov
 */

import java.util.Scanner;

public class Shop {

    public static void main(String[] args) {
        Candy candy1 = new Candy("Черноголовка", 100.00, 29.99, "cherry");
        Candy candy2 = new Candy("Шипучка",100.00, 29.99, "orange");
        Jellybean jelly1 = new Jellybean("Мишки",120.20, 60.00, "bears");
        Jellybean jelly2 = new Jellybean("Червячки",150.00, 65.00, "worms");
        Chocolate choc1 = new Chocolate("Тоблерон",90.10, 260.00, "Switz");
        Chocolate choc2 = new Chocolate("Алёнка",90.00, 120.00, "Rus");

        Sweets[] gift = {candy1, candy2, jelly1, jelly2, choc1, choc2};

        Double totalweight = 0.0;
        Double totalprice = 0.0;

        System.out.println("Ваш подарок состоит из:");

        for (Sweets someSweets : gift) {
            System.out.println(someSweets.toString());
            totalweight += someSweets.getWeight();
            totalprice += someSweets.getPrice();

        }
        System.out.println();
        System.out.println("Общая масса подарка: " + totalweight);
        System.out.println("Общая стоимость подарка: "+ totalprice);
    }
}
