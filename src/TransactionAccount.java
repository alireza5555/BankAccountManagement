public class TransactionAccount extends BankAccount{
    private final double overDraftLimit = 500;

    public TransactionAccount (String accountNumber, String accountHolderName, double initialBalance){
        super( accountNumber, accountHolderName , initialBalance);
    }

    @Override
    public void calculateInterest() {
        System.out.println("There is no interest for this account");
    }

    @Override
    public void withdraw(double amount){
        if(amount <=0){
            System.out.println("Amount of money should be positive");
            return;
        }

        double temp = balance + overDraftLimit;
        if (temp <amount)
        {
            System.out.println("you cant withdraw more than " + temp);
            return;
        }

        balance-= amount;
        System.out.println(amount + " Withdrawn from " + getAccountNumber());
    }
}
