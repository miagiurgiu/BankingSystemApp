package domain;

public class CurrentAccount extends BankAccount{
    private double overdraftLimit;
    public String description;
    public CurrentAccount(int accountNumber,double balance, Customer owner, double overdraftLimit){
        super(accountNumber,balance,owner);
        this.overdraftLimit=overdraftLimit;
    }
    public CurrentAccount(int accountNumber,double balance, Customer owner, double overdraftLimit,String description){
        this(accountNumber,balance,owner,overdraftLimit);
        System.out.println("Description of current account: "+description);
    }
    @Override
    public void withdraw(double amount){
        if(amount<=0){
            System.out.println("Withdrawal amount must be positive");
        }
        else if(getBalance()-amount>=-overdraftLimit){
            setBalance(getBalance()-amount);
        }
        else{
            System.out.println("Overdraft limit exceeded");
        }
    }
    @Override
    public void displayAccountInfo(){
        System.out.println("Account number: "+getAccountNumber()+", balance: "+getBalance()+", owner: "+getOwner().getName()+", overdraft limit: "+overdraftLimit);
    }
}
