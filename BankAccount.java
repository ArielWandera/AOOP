public class BankAccount {
    // Static variable to keep track of the total number of accounts
    private static int totalAccounts = 0;
    
    // Instance variable to store the account balance
    private double balance;
    
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
        totalAccounts++; 
    }
    
    public void deposit(double amount) {
        balance += amount; 
        System.out.println("Deposited: shs." + amount + ", New Balance: shs." + balance);
    }
    
 
    public void withdraw(double amount) {
        // Local variable to store the new balance temporarily
        double newBalance = balance - amount;
        
        if (newBalance >= 0) { 
            balance = newBalance; 
            System.out.println("Withdrew: shs." + amount + ", New Balance: shs." + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public static void displayTotalAccounts() {
        System.out.println("Total accounts created: " + totalAccounts);
    }
    
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(700000.0);
        BankAccount account2 = new BankAccount(1000000.0);
        
        
        account1.deposit(200000);
        account1.withdraw(150000);
        
        account2.deposit(500000);
        account2.withdraw(1200000);
        
       
        BankAccount.displayTotalAccounts();
    }
}
