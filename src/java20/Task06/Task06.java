package java20.Task06;

/**
 * Задание №6
 * Программа читает слова из файла file.txt.
 * Далее слова сортируются в алфавитном порядке, производится расчёт частоты употребления каждого слова в тексте.
 * Выводится в консоль статистика по словам.
 * Производится поиск слова с максимальным количеством повторений и вывод этой информации на консоль.
 *
 * @author Marenkov
 */

import java.io.File;
import java.util.List;
import java.util.Map;

public class Task06 {

    public static void main(String[] args) {
        File file = FileHelper.getFileByPath("D:\\Aplana\\Java_2.0\\src\\java20\\file.txt");
        String text = FileHelper.getTextFromFile(file);
        List<String> words = WordHelper.getListFromString(text);
        WordHelper.alphabeticalSorting(words);
        System.out.println("Слова в алфавитном порядке: " + words);
        Map<String, Integer> wordAndCount = WordHelper.calculateDuplicates(words);
        WordHelper.printwords(wordAndCount);
        Map.Entry<String, Integer> max = WordHelper.getMaxRepetition(wordAndCount);
        WordHelper.printMaxRepetition(max);
    }
}
