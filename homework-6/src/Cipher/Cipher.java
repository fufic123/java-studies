package Cipher;

public class Cipher {
    public static void main(String[] args) {
        // Test ACipher
        ICipher aCipher = new ACipher();
        String encodedA = aCipher.encode("hello");
        System.out.println("ACipher Encoded: " + encodedA);
        System.out.println("ACipher Decoded: " + aCipher.decode(encodedA));

        // Test BCipher
        ICipher bCipher = new BCipher();
        String encodedB = bCipher.encode("hello");
        System.out.println("BCipher Encoded: " + encodedB);
        System.out.println("BCipher Decoded: " + bCipher.decode(encodedB));
    }
}