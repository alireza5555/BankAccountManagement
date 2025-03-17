import java.util.ArrayList;

public class BankCustomers {
    private ArrayList<BankAccount> accountList;

    public BankCustomers (){
        accountList = new ArrayList<BankAccount>();
    }

    public void addAccount(BankAccount account){
    accountList.add(account);
    }

    public void showAllBalances(){
        for (BankAccount temp : accountList){
            System.out.println("Account Holder Name:" + temp.getAccountHolderName() + "\n" + "Account Number:" + temp.getAccountNumber() + "Account balance:" + temp.getBalance());
        }
    }

    public BankAccount findAccount (String accountNumber){
        for (BankAccount temp : accountList){
            if(accountNumber == temp.getAccountNumber()){
                return temp;
            }
        }
        System.out.println("Account not found");
        return null;
    }
}

