import java.util.Date;

public class Question3 {
    public static void main(String[] args) {
        Account testAccount = new Account(1122, 20000, 4.5);

        testAccount.withdraw(2500);
        testAccount.deposit(3000);
        System.out.println("The current balance is " + testAccount.getBalance() + " baht");
        System.out.println("The monthly interest is " + testAccount.getMonthlyInterest() + " baht");
        System.out.println("The date this account was created is " + testAccount.getDateCreated());
    }
}

class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated;

    public Account() {

    }

    public Account(int idF, double balanceF, double annualInterestRateF) {
        id = idF;
        balance = balanceF;
        annualInterestRate = annualInterestRateF;
    }

    public void setID(int idF) {
        id = idF;
    }

    public void setBalance(double balanceF) {
        balance = balanceF;
    }

    public void setAnnualInterestRate(double annualInterestRateF) {
        annualInterestRate = annualInterestRateF;
    }

    public int getID() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public Date getDateCreated() {
        dateCreated = new Date();
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return (annualInterestRate / 12) / 100;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }
}
