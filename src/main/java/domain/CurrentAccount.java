package domain;

public class CurrentAccount extends BankAccount{
    private double overdraftLimit;
    public CurrentAccount(int accountNumber,double balance, Customer owner, double overdraftLimit){
        super(accountNumber,balance,owner);
        this.overdraftLimit=overdraftLimit;
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
}
