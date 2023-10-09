class TestBankAccount {
    public static void main(String[] args) {
        BankAccount myBankAccount = new BankAccount();
        System.out.println("I created a bank account with number: " + myBankAccount.getAccountNumber());
        
        myBankAccount.depositMoney(100.49, "checking");
        myBankAccount.depositMoney(3.00, "savings");
        System.out.print("After depositing, ");
        myBankAccount.displayAccountBalance();
        
        // Show the total money in the bank
        System.out.println("Total money in the bank: " + BankAccount.totalHoldings);
        
        myBankAccount.withdrawMoney(50, "checking");
        myBankAccount.withdrawMoney(50, "savings");
        System.out.print("After withdrawing, ");
        myBankAccount.displayAccountBalance();

        System.out.println("Total money in the bank after withdrawals: " + BankAccount.totalHoldings);
        
        BankAccount secondBankAccount = new BankAccount();
        System.out.println("I created a second bank account with number: " + secondBankAccount.getAccountNumber());
        
        secondBankAccount.depositMoney(3, "checking");
        secondBankAccount.depositMoney(99, "savings");
        System.out.print("For my second account, after depositing, ");
        secondBankAccount.displayAccountBalance();
        
        secondBankAccount.withdrawMoney(50, "checking");
        System.out.print("After withdrawing from checking in second account, ");
        secondBankAccount.displayAccountBalance();
    }
}
