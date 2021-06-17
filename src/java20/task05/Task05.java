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

            Calc calc = new Calc(x, y, oper);
            System.out.printf("Результат: %.4f\n", calc.calculation());
            scanner.close();

        }
    }
}