public class Main {
    public static void main(String[] args) {
        BankCustomers mainBank = new BankCustomers();

        SavingAccount saveAcc1 = new SavingAccount("5858" , "Alireza" , 10000);
        SavingAccount saveAcc2 = new SavingAccount("6040" , "Fateme" , 400);
        SavingAccount saveAcc3 = new SavingAccount("3041" , "Sara" , 2000);

        TransactionAccount transactionAcc1 = new TransactionAccount("5858" , "Alireza" , 10000);
        TransactionAccount transactionAcc2 = new TransactionAccount("6040" , "Fateme" , 400);
        TransactionAccount transactionAcc3 = new TransactionAccount("3041" , "Sara" , 2000);

        mainBank.addAccount(saveAcc1);
        mainBank.addAccount(saveAcc2);
        mainBank.addAccount(saveAcc3);

        mainBank.addAccount(transactionAcc1);
        mainBank.addAccount(transactionAcc2);
        mainBank.addAccount(transactionAcc3);

        mainBank.findAccount("5859");

        BankAccount temp = mainBank.findAccount("5858");
        System.out.println(temp.getBalance());
        temp.deposit(1000);
        System.out.println(temp.getBalance());
        System.out.println();

        transactionAcc1.deposit(-100);
        System.out.println("\n");

        transactionAcc3.calculateInterest();
        System.out.println("\n");

        saveAcc3.calculateInterest();
        System.out.println("\n");

        System.out.println("transaction3 balance : " + transactionAcc3.getBalance());
        System.out.println("save acc3 balance : " + saveAcc3.getBalance());
        System.out.println("\n");

        saveAcc1.withdraw(200);
        System.out.println();

        saveAcc2.withdraw(-199);
        System.out.println();

        saveAcc3.withdraw(99999);
        System.out.println("\n");

        transactionAcc1.withdraw(200);
        System.out.println();

        transactionAcc2.withdraw(-199);
        System.out.println();

        transactionAcc3.withdraw(99999);

    }
}