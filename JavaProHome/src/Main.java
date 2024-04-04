import homeworkfive.phonebook.Entry;
import homeworkfive.phonebook.Phonebook;

import java.util.*;

public class Main {
    // 1
    public static void main(String[] args) {
        List<String> words = List.of("dog", "cat", "cat", "bird", "camel", "elephant", "cat");
        int count = countOccurrence(words, "cat");
        System.out.println(count);

        // 2
        int[] intArray = {1, 2, 3};
        List<Integer> integerList = toList(intArray);
        System.out.println(integerList);

        // 3
        List<Integer> numbers = List.of(1, 2, 2, 3, 4, 4, 5, 6, 6, 7);
        List<Integer> uniqueNumbers = findUnique(numbers);
        System.out.println(uniqueNumbers);

        // 4
        List<String> animals = List.of("bird", "fox", "bird", "cat", "dog", "cat", "dog", "dog");
        calcOccurance(animals);

        // 5
        List<String> newAnimals = List.of("bird", "fox", "bird", "cat", "dog", "cat", "dog", "dog");
        List<Map<String, Object>> occurrences = findOccurrence(newAnimals);
        for (Map<String, Object> occurrence : occurrences) {
            System.out.println(occurrence);
        }

        // 6
        Phonebook phonebook = new Phonebook();
        List<Entry> testEntries = Arrays.asList(
                new Entry("Alice", "123-456-7890"),
                new Entry("Bob", "987-654-3210"),
                new Entry("Charlie", "555-666-7777"),
                new Entry("David", "222-333-4444"),
                new Entry("Eve", "999-888-7777"),
                new Entry("Alice", "111-222-3333")
        );
        for (Entry entry : testEntries) {
            phonebook.add(entry);
        }
        System.out.println(phonebook.find("Bob").getPhone());
        System.out.println(phonebook.find("Alice").getPhone());
        System.out.println(phonebook.findAll("Alice").size());

    }

    public static int countOccurrence(List<String> words, String target) {
        int count = 0;
        for (String word : words) {
            if (word.equals(target)) {
                count++;
        }
    }
        return count;
    }

    public static List<Integer> toList(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (int i : array) {
            list.add(i);
        }
        return list;
    }

    public static List<Integer> findUnique(List<Integer> list) {
        Set<Integer> set = new HashSet<>(list);
        return new ArrayList<>(set);
    }

    public static void calcOccurance(List<String> words) {
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static List<Map<String, Object>> findOccurrence(List<String> words) {
        Map<String, Integer> wordCount = new HashMap<>();
        List<Map<String, Object>> resultList = new ArrayList<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        wordCount.forEach((word, count) -> {
            Map<String, Object> occurrence = new HashMap<>();
            occurrence.put("name", word);
            occurrence.put("occurrence", count);
            resultList.add(occurrence);
        });

        return resultList;
    }
}