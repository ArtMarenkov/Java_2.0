package java20.Task07;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Задание №7.
 * Реализован калькулятор в стиле ООП.
 * Выполнена обработка исключений с помощью try/catch для случая деления на ноль.
 *
 * @author Marenkov
 */

public class Task07 {

    //public static String str;

    public static void main(String[] args) {

        Double x, y;
        x = y = 0.0;
        Boolean flag = true;

        Scanner scanner = new Scanner(System.in);

        while (flag) {

            try {

                if (x == 0.0) {
                    System.out.println("Введите первое число:");
                    x = Double.parseDouble(scanner.nextLine());
                }
                if (y == 0.0) {
                    System.out.println("Введите второе число:");
                    y = Double.parseDouble(scanner.nextLine());
                    flag = false;
                }
            } catch (NumberFormatException e) {
                System.err.println("Допустим только ввод чисел с плавающей точкой.");
            }
        }
        System.out.println("Введите желаемую операцию из указанных ниже.");
        System.out.println("'+' для сложения;");
        System.out.println("'-' для вычитания;");
        System.out.println("'*' для умножения;");
        System.out.println("'/' для деления;");
        System.out.println("↓ Поле для ввода операции↓");

        String oper = scanner.next();

        Calc_try_catch calcTrycatch = new Calc_try_catch(x, y, oper);
        try {
            calcTrycatch.calculation();
        }
        catch (IllegalArgumentException e) {
            //str = e.getMessage();
            System.err.println(e.getMessage());
        }
        System.out.printf("Результат: %.4f\n", calcTrycatch.calculation());
        scanner.close();
    }
}