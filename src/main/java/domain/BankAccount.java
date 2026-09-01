package domain;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private Customer owner; // association (not aggregation because bank account can't exist without a customer; not composition because a customer can exist without an account), one-to-many/one-to-one
    // Person owner=new Customer(); ??
    private static int accountCount;

    public BankAccount(int accountNumber,double balance,Customer owner){
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.owner=owner;
    }
    public int getAccountNumber(){
        return this.accountNumber;
    }
    public double getBalance(){
        return this.balance;
    }
    public Customer getOwner(){
        return this.owner;
    }
    public static int getAccountCount(){
       return accountCount;
    }
    public void deposit(double amount){
        if(amount>0){
            balance +=amount;
        }
        else {
            System.out.println("Deposit amount must be a positive number");
        }
    }
    public void deposit(double amount, String description){
        deposit(amount);
        System.out.println("Transaction description: "+description);
    }
    public void withdraw(double amount){
        if(amount<=0){
            System.out.println("Withdrawal amount must be positive");
        }
        else if(balance-amount>=0) {
            balance -=amount;
        }
        else{
            System.out.println("Insufficient resources");
        }
    }
    public void withdraw(double amount,String description){
       withdraw(amount);
       System.out.println("Transaction description: "+description);
    }

    protected void setBalance(double balance){
        this.balance=balance;
    }
    public void displayAccountInfo(){
        System.out.println("Account number: "+accountNumber+", balance: "+balance+", owner: "+owner.getName());
    }
}
