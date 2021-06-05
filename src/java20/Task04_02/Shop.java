package java20.Task04_02;

/**
 * Задание №4_2
 *
 * @author Marenkov
 */

import java.util.Scanner;

public class Shop {

    public static void main(String[] args) {
        System.out.println("Choose sweet from the list: " + SweetGenerator.CANDY + "," + SweetGenerator.JELLYBEAN + " or " + SweetGenerator.CHOCOLATE);
        System.out.println("If you're done then type 'ok'");
        GiftConstructor giftConstructor = new GiftConstructor();

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String answer = scanner.nextLine();
            if (answer.equals("ok")) {
                scanner.close();
                break;
            }

            if (!answer.equalsIgnoreCase(SweetGenerator.CANDY) && !answer.equalsIgnoreCase(SweetGenerator.JELLYBEAN) && !answer.equalsIgnoreCase(SweetGenerator.CHOCOLATE)) {
                System.out.println("Sorry, there is no such sweet as " + answer);
            }

            switch (answer.toLowerCase()) {
                case SweetGenerator.CANDY:
                    giftConstructor.addSweetToGift(SweetGenerator.getCandy());
                    break;
                case SweetGenerator.JELLYBEAN:
                    giftConstructor.addSweetToGift(SweetGenerator.getJellybean());
                    break;
                case SweetGenerator.CHOCOLATE:
                    giftConstructor.addSweetToGift(SweetGenerator.getChocolate());
                    break;
            }
        }

        System.out.println("Your gift is: ");
        for (Sweet sweet : giftConstructor.getGift()){
            System.out.println(sweet.toString());
        }
        System.out.println("Total Cost: " + giftConstructor.getTotalCost());
        System.out.println("Total Weight: " + giftConstructor.getTotalWeight());
    }
}
