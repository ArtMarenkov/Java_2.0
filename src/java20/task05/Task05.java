package java20.task05;

import java.util.Scanner;

/**
 * Задание №5.
 * Реализован калькулятор в стиле ООП.
 *
 * @author Marenkov
 */

public class Task05 {

    public static void main(String[] args) {

        {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите первое число:");
            double x = scanner.nextDouble();

            System.out.println("Введите второе число:");
            double y = scanner.nextDouble();

            System.out.println("Введите желаемую операцию из указанных ниже.");
            System.out.println("'+' для сложения;");
            System.out.println("'-' для вычитания;");
            System.out.println("'*' для умножения;");
            System.out.println("'/' для деления;");
            System.out.println("↓ Поле для ввода операции↓");

            String oper = scanner.next();

            double z;

            switch (oper) {
                case "+":
                    Sum sum = new Sum(x, y);
                    z = sum.sum();
                    System.out.printf("Результат: %.4f\n", z);
                    break;
                case "-":
                    Substr substr = new Substr(x, y);
                    z = substr.substr();
                    System.out.printf("Результат: %.4f\n", z);
                    break;
                case "*":
                    Mult mult = new Mult(x, y);
                    z = mult.mult();
                    System.out.printf("Результат: %.4f\n", z);
                    break;
                case "/":

                    if (y == 0)
                        System.out.println("На ноль делить нельзя!");
                    else {
                        Divis divis = new Divis(x, y);
                        z = divis.divis();
                        System.out.printf("Результат: %.4f\n", z);
                    }
                    break;
                default:
                    System.out.println("Некорректная операция.");
                    break;
            }

            scanner.close();

        }
    }
}