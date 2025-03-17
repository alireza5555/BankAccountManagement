public abstract class BankAccount {
    final private String accountNumber;
    private String accountHolderName;
    protected double balance;

    public BankAccount(String accountNumber, String accountHolderName ,double balance){
    this.accountNumber = accountNumber;
    this.accountHolderName = accountHolderName;
    this.balance = balance;
    }

    public abstract void calculateInterest();

    public void deposit(double amount){
        if(amount <=0){
            System.out.println("Amount of money should be positive");
            return;
        }

        balance+= amount;
        System.out.println(amount + " Added to " + accountNumber);
    }

    public void withdraw(double amount){
        if(amount <=0){
            System.out.println("Amount of money should be positive");
            return;
        }

        balance-= amount;
        System.out.println(amount + " Withdrawn from " + accountNumber);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }
}
