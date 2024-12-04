package Cipher;

public class ACipher implements ICipher {
    @Override
    public String encode(String input) {
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            result.append((char) (c + 1));
        }
        return result.toString();
    }

    @Override
    public String decode(String input) {
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            result.append((char) (c - 1));
        }
        return result.toString();
    }
}