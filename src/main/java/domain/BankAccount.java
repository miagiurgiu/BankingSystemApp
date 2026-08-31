package domain;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private Customer owner;
    // Person owner=new Customer(); ??

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
    public void deposit(double amount){
        if(amount>0){
            balance +=amount;
        }
        else {
            System.out.println("Deposit amount must be a positive number");
        }
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
    protected void setBalance(double balance){
        this.balance=balance;
    }
}
