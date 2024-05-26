package com.ilivinskyi.textdataparser;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class BookParser {

    private final Book book;

    public BookParser(Book book) {
        this.book = book;
    }

    public Map<String, Long> getMostPopularWords(int numberOfWords) {
        return book
            .bookContent()
            .stream()
            .filter(w -> w.length() > 2)
            .collect(Collectors.groupingBy(w -> w, Collectors.counting()))
            .entrySet()
            .stream()
            .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
            .limit(numberOfWords)
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    public int getNumberOfUniqueWords() {
        Set<String> unique = new HashSet<>(book.bookContent());
        return unique.size();
    }

    public int getNumberOfWords() {
        return book.bookContent().size();
    }
}
