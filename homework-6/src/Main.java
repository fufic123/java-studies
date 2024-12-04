import BankingSystem.BankingSystem;
import Cipher.Cipher;
import Instrument.Instrument;
import Construction.Construction;

public class Main {
    public static void main(String[] args) {
        System.out.println("Running BankingSystem...");
        BankingSystem.main(new String[]{});

        System.out.println("\nRunning Cipher...");
        Cipher.main(new String[]{});

        System.out.println("\nRunning Instrument...");
        Instrument.main(new String[]{});

        System.out.println("\nRunning Construction...");
        Construction.main(new String[]{});
    }
}
