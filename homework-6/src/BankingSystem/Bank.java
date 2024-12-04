package BankingSystem;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<ATM> atms;

    public Bank() {
        this.atms = new ArrayList<>();
    }

    public void addATM(ATM atm) {
        atms.add(atm);
    }

    public int getTotalMoney() {
        int total = 0;
        for (ATM atm : atms) {
            total += atm.getTotalMoney();
        }
        return total;
    }
}
