package domain;

public class SavingsAccount extends BankAccount{
    private double interestRate;
    public SavingsAccount(int accountNumber,double balance,Customer owner,double interestRate){
        super(accountNumber, balance, owner);
        this.interestRate=interestRate;
    }
    private double calculateInterest(){
        return getBalance()*interestRate/100;
    }
    @Override
    public void displayAccountInfo(){
        System.out.println("Account number: "+getAccountNumber()+", balance: "+getBalance()+", owner: "+getOwner().getName()+", interest rate: "+interestRate);
    }
}
