package BankAccount;


public class App {
    public static void main(String[] args) throws Exception {
        
        CurrentAccount darrel = new CurrentAccount();
        SavingsAccount darrel1 = new SavingsAccount();

        darrel.deposit();
        darrel.withdraw();

        System.out.println(" ");
        
        darrel1.deposit();
        darrel1.withdraw();

    }

    
}
