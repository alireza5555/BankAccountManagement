public class SavingAccount extends BankAccount{
    private final double interestRate = 3.0/100;

    public SavingAccount(String accountNumber, String accountHolderName , double initialBalance){
        super(accountNumber , accountHolderName , initialBalance);
    }

    @Override
    public void calculateInterest() {
        deposit(balance*interestRate);
        System.out.println("Account type: SavingAccount");
    }
}
