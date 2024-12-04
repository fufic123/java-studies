package Cipher;

public class BCipher implements ICipher {
    @Override
    public String encode(String input) {
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                int reverse = 'z' - (c - 'a');
                result.append((char) reverse);
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    @Override
    public String decode(String input) {
        return encode(input);
    }
}