package java20;

import java.util.Arrays;
import java.util.Random;

/**
 * Задание №4.2
 * Создаётся массив из случайных чисел в отрезке [-10;10] из 20 элементов.
 * В созданном массиве производится поиск минимального положительного и максимального отрицательного элементов.
 * Формируется новый массив путём переставления найденных минимального положительного и максимального отрицательного элементов.
 *
 * @author Marenkov
 */

public class Task04_01 {

    public static void main(String[] args) {

        Random random = new Random();
        int[] arr = new int[20];
        for (int i = 0; i < 20; i++) {
            arr[i] = random.nextInt(20 + 1) - 10; // [(10 - (-10) + 1) + (-10)] → (максимальное значение - минимальное значение) + минимальное значение; "+1" - для захвата границ диапазона.
        }

        //вывод полученного массива
        int a;
        int boof1 = 0;
        int boof2 = 0;

        System.out.println(Arrays.toString(arr));

        int minpos, maxneg;
        minpos = arr[0];
        maxneg = arr[0];

        //поиск минимального положительного элемента массива
        for (int j = 0; j < arr.length; j++) {

            if (minpos > 0) {

                if (arr[j] >= 0) {
                    if (arr[j] < minpos) {
                        minpos = arr[j];
                        boof1 = j;
                    }
                }
            } else {
                minpos = arr[j];
            }

        }
        System.out.println();
        System.out.println("Номер минимального положительного элемента массива = " + (boof1 + 1));
        System.out.println("Минимальный положительный элемент массива = " + minpos);
        System.out.println();

        //поиск минимального элемента массива
        for (int k = 0; k < arr.length; k++) {

            if (maxneg < 0) {
                if (arr[k] < 0 && maxneg < 0) {
                    if (arr[k] > maxneg) {
                        maxneg = arr[k];
                        boof2 = k;
                    }
                }
            } else {
                maxneg = arr[k];
            }
        }

        System.out.println("Номер максимального отрицательного элемента массива = " + (boof2 + 1));
        System.out.println("Максимальный отрицательный элемент массиваа = " + maxneg);
        System.out.println();

        //Массив с переставленными элементами:

        arr[boof1] = maxneg;
        arr[boof2] = minpos;

        System.out.println();
        System.out.println("Вывод массива с переставленными элементами:");
        System.out.println(Arrays.toString(arr));
    }
}