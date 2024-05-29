package unittesting;

import java.util.HashMap;

public class MaximumNumberOfBalloonsSolver {

    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (char c : text.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        int minInstances = Integer.MAX_VALUE;
        minInstances = Math.min(minInstances, charCount.getOrDefault('b', 0));
        minInstances = Math.min(minInstances, charCount.getOrDefault('a', 0));
        minInstances = Math.min(minInstances, charCount.getOrDefault('l', 0) / 2);
        minInstances = Math.min(minInstances, charCount.getOrDefault('o', 0) / 2);
        minInstances = Math.min(minInstances, charCount.getOrDefault('n', 0));

        return minInstances;
    }
}
