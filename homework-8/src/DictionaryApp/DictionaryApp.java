package DictionaryApp;

public class DictionaryApp {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();

        dictionary.addWord("hello", "hola");
        dictionary.addWord("world", "mundo");
        dictionary.translate("hello");
        dictionary.translate("hello");
        dictionary.translate("world");

        System.out.println("Top Words:");
        dictionary.topWords();

        System.out.println("Least Used Words:");
        dictionary.leastUsedWords();
    }
}
