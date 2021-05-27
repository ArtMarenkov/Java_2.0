package java20;

import java.util.Scanner;

/**
 * Задание №2.
 * Калькулятор для чисел типа double.
 *
 * Задание №3.
 * Добавлена функция ввода элементов в массив и поиск элемента с максимальной длиной.
 *
 * @author Marenkov
 */

public class Task02 {

    public static void main(String[] args) {

        {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите желаемый вариант работы программы.");
            System.out.println("1 - для выбора режима калькулятора.");
            System.out.println("2 - для выбора режима поиска максимального слова в вводимом массиве.");
            int ent = scanner.nextInt();

            switch (ent) {
                case 1:

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
                            System.out.printf("Результат: %.4f\n", z);
                            break;
                        case "-":
                            z = x - y;
                            System.out.printf("Результат: %.4f\n", z);
                            break;
                        case "*":
                            z = x * y;
                            System.out.printf("Результат: %.4f\n", z);
                            break;
                        case "/":
                            z = x / y;
                            if (y == 0)
                                System.out.println("На ноль делить нельзя!");
                            else
                                System.out.printf("Результат: %.4f\n", z);
                            break;
                        default:
                            System.out.println("Некорректная операция.");
                            break;
                    }
                    break;

                case 2:

                    System.out.println("Укажите количество элементов массива:");
                    int a = scanner.nextInt();

                    String[] array = new String[a];
                    for (int a1 = 0; a1 < a; a1++) {


                        System.out.println("Введите элемент №" + (a1 + 1));
                        array[a1] = scanner.next();
                    }


                    //вывод полученного массива

                    System.out.println("Хотите вывести введённый массив в консоль? Y/N");
                    String show = scanner.next();

                    switch (show) {

                        case "Y":
                            System.out.println();
                            System.out.print("[ ");
                            for (int i1 = 0; i1 < a; i1++) {
                                System.out.print(array[i1] + " ");
                            }
                            System.out.print("]\n");

                        case "y":
                            System.out.println();
                            System.out.print("[ ");
                            for (int i1 = 0; i1 < a; i1++) {
                                System.out.print(array[i1] + " ");
                            }
                            System.out.print("]\n");

                        default:
                            break;
                    }

                    // вывод максимального значения массива

                    String maxval = "null";
                    int maxsize;

                    maxsize = array[0].length();

                    for (int j = 0; j < array.length; j++) {

                        if (array[j].length() > maxsize) {
                            maxsize = array[j].length();
                            maxval = array[j];
                        }
                    }
                    System.out.println();
                    System.out.println("Максимальный элемент массива = " + maxval);
                    System.out.println();
                    break;

                default:
                    System.out.println("Некорректный выбор режима работы программы.");
                    break;


            }
            scanner.close();

        }
    }
}