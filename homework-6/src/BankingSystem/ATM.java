package BankingSystem;

import java.util.HashMap;
import java.util.Map;

public class ATM {
    private Map<Integer, Integer> denominations;
    private int minWithdrawal;
    private int maxNotes;

    public ATM(int minWithdrawal, int maxNotes) {
        this.denominations = new HashMap<>();
        this.minWithdrawal = minWithdrawal;
        this.maxNotes = maxNotes;
        initializeDenominations();
    }

    private void initializeDenominations() {
        int[] nominals = {1, 2, 5, 10, 20, 50, 100, 200, 500};
        for (int nominal : nominals) {
            denominations.put(nominal, 0);
        }
    }

    public void loadMoney(int nominal, int count) {
        denominations.put(nominal, denominations.getOrDefault(nominal, 0) + count);
    }

    public void withdrawMoney(int amount) throws InsufficientFundsException, ExceedsNoteLimitException {
        if (amount < minWithdrawal) {
            throw new InsufficientFundsException("Amount is less than the minimum withdrawal limit.");
        }

        Map<Integer, Integer> temp = new HashMap<>();
        int remaining = amount;

        for (int nominal : denominations.keySet().stream().sorted((a, b) -> b - a).toList()) {
            int notes = Math.min(remaining / nominal, denominations.get(nominal));
            remaining -= notes * nominal;
            temp.put(nominal, notes);
        }

        if (remaining > 0) {
            throw new InsufficientFundsException("Cannot withdraw the exact amount with available denominations.");
        }

        if (temp.values().stream().mapToInt(Integer::intValue).sum() > maxNotes) {
            throw new ExceedsNoteLimitException("Exceeds maximum note limit.");
        }

        temp.forEach((nominal, count) -> denominations.put(nominal, denominations.get(nominal) - count));
    }

    public int getTotalMoney() {
        return denominations.entrySet().stream().mapToInt(e -> e.getKey() * e.getValue()).sum();
    }
}
