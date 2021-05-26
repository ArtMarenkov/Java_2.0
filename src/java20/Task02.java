package java20;
import java.util.Scanner;

/**
 * Задание №2.
 * Калькулятор для чисел типа double.
 * @author Marenkov
 */

public class Task02 {

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
                    z = x + y;
                    System.out.printf("Результат: %.4f", z);
                    break;
                case "-":
                    z = x - y;
                    System.out.printf("Результат: %.4f", z);
                    break;
                case "*":
                    z = x * y;
                    System.out.printf("Результат: %.4f", z);
                    break;
                case "/":
                    z = x / y;
                    if (y == 0)
                        System.out.println("На ноль делить нельзя!");
                    else

                        System.out.printf("Результат: %.4f", z);
                    break;
                default:
                    System.out.println("Некорректная операция.");
                    break;
            }

        }

    }
}