package java20.Task04_02;

/**
 * Задание №4_2
 *
 * @author Marenkov
 */

public class SweetGenerator {
    public static final String CANDY = "candy";
    public static final String JELLYBEAN = "jellybean";
    public static final String CHOCOLATE = "chocolate";

    public static Sweet getCandy() {
        return new Sweet(CANDY, 0.1, 10, "cherry");
    }

    public static Sweet getJellybean() {
        return new Sweet(JELLYBEAN, 0.05, 7, "orange");
    }

    public static Sweet getChocolate() {
        return new Sweet(CHOCOLATE, 100.0, 120, "with nuts");
    }
}