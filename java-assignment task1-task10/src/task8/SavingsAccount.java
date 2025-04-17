package task8;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, double accountBalance, double interestRate) {
        super(accountNumber, "Savings", accountBalance);
        this.interestRate = interestRate;
    }

    @Override
    public void calculateInterest() {
        double interest = (accountBalance * interestRate) / 100;
        accountBalance += interest;
        System.out.println("Interest of $" + interest + " added to Savings Account.");
    }
}
