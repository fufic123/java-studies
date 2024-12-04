package BankingSystem;

public class BankingSystem {
    public static void main(String[] args) {
        Bank bank = new Bank();

        ATM atm1 = new ATM(100, 50);
        ATM atm2 = new ATM(100, 50);

        atm1.loadMoney(100, 10); // 1000 in total
        atm1.loadMoney(500, 5);  // 2500 in total
        atm2.loadMoney(50, 20);  // 1000 in total
        atm2.loadMoney(200, 15); // 3000 in total

        bank.addATM(atm1);
        bank.addATM(atm2);

        System.out.println("Total money in the bank: " + bank.getTotalMoney() + " UAH");

        try {
            atm1.withdrawMoney(1500);
            System.out.println("ATM1 balance after withdrawal: " + atm1.getTotalMoney() + " UAH");
        } catch (InsufficientFundsException | ExceedsNoteLimitException e) {
            System.out.println(e.getMessage());
        }

        try {
            atm2.withdrawMoney(200);
            System.out.println("ATM2 balance after withdrawal: " + atm2.getTotalMoney() + " UAH");
        } catch (InsufficientFundsException | ExceedsNoteLimitException e) {
            System.out.println(e.getMessage());
        }
    }
}
