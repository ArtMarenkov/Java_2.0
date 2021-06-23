package java20.Task06;

import java.util.*;

public class WordHelper {
    public static List<String> getListFromString(String text) {
        return Arrays.asList(text.split(" "));
    }

    public static void alphabeticalSorting(List<String> words) {
        Collections.sort(words);
    }

    public static Map<String, Integer> calculateDuplicates(List<String> words) {
        Map<String, Integer> wordAndCount = new HashMap<>();
        for (String name : words) {
            Integer count = wordAndCount.get(name);
            if (count == null) {
                wordAndCount.put(name, 1);
            } else {
                wordAndCount.put(name, ++count);
            }
        }
        return wordAndCount;
    }

    public static void printwords(Map<String, Integer> wordAndCount) {
        for (Map.Entry<String, Integer> entry : wordAndCount.entrySet()) {
            System.out.println("Слово: "
                    + entry.getKey()
                    + ", упониманий: "
                    + entry.getValue());
        }
    }

    public static Map.Entry<String, Integer> getMaxRepetition(Map<String, Integer> wordAndCount) {
        Map.Entry<String, Integer> maxEntry = null;
        for (Map.Entry<String, Integer> entry : wordAndCount.entrySet()) {
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
                maxEntry = entry;
            }
        }
        return maxEntry;
    }

    public static void printMaxRepetition(Map.Entry<String, Integer> maxEntry) {
        System.out.println("слово с максимальным количеством повторений: "
                + maxEntry.getKey()
                + ", "
                + " упониманий: "
                + maxEntry.getValue());
    }
}