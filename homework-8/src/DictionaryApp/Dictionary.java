package DictionaryApp;

import java.util.*;

public class Dictionary {
    private Map<String, String> translations = new HashMap<>();
    private Map<String, Integer> usageCount = new HashMap<>();

    public void addWord(String word, String translation) {
        translations.put(word, translation);
        usageCount.put(word, 0);
    }

    public void deleteWord(String word) {
        translations.remove(word);
        usageCount.remove(word);
    }

    public String translate(String word) {
        if (translations.containsKey(word)) {
            usageCount.put(word, usageCount.get(word) + 1);
            return translations.get(word);
        }
        return "Word not found!";
    }

    public void topWords() {
        translations.keySet().stream()
                .sorted((a, b) -> usageCount.get(b) - usageCount.get(a))
                .limit(10)
                .forEach(word -> System.out.println(word + ": " + usageCount.get(word)));
    }

    public void leastUsedWords() {
        translations.keySet().stream()
                .sorted(Comparator.comparingInt(usageCount::get))
                .limit(10)
                .forEach(word -> System.out.println(word + ": " + usageCount.get(word)));
    }
}
