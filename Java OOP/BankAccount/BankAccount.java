import java.util.Random;

public class BankAccount {

    public static int numAccounts = 0;
    public static double totalHoldings = 0;

    // instance things
    private int accountNumber; 
    private double checkingBalance;
    private double savingsBalance;

    public BankAccount() {
        numAccounts++;
        this.checkingBalance = 0;
        this.savingsBalance = 0;
        this.accountNumber = generateId();
    }

    private int generateId() {
        Random random = new Random();
        return random.nextInt(999999999) + 1; 
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void depositMoney(double amount, String accountType) {
        if(accountType.equals("savings")) {
            savingsBalance += amount;
        } else if(accountType.equals("checking")) {
            checkingBalance += amount;
        }
        totalHoldings += amount;
    }

    public void withdrawMoney(double amount, String accountType) {
        if(accountType.equals("savings")) {
            if(savingsBalance >= amount) {
                savingsBalance -= amount;
                totalHoldings -= amount;
            } else {
                System.out.println("Insufficient funds in savings.");
            }
        } else if(accountType.equals("checking")) {
            if(checkingBalance >= amount) {
                checkingBalance -= amount;
                totalHoldings -= amount;
            } else {
                System.out.println("Insufficient funds in checking.");
            }
        } else {
            System.out.println("Invalid account type!");
        }
    }

    public void displayAccountBalance() {
        System.out.println("Savings: $" + savingsBalance + ", Checking: $" + checkingBalance);
    }
}
