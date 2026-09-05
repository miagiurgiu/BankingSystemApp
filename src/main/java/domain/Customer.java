package domain;
import java.util.ArrayList;
import java.util.List;

public class Customer extends Person {
    private int customerId; // private for encapsulation
    private List<BankAccount> accountsList; // association (bank account can't exist without a customer), one-to-many (customer can have more accounts)
    public Customer(String name,int age,String email,int customerId){
        super(name,age,email);
        this.customerId=customerId;
        this.accountsList=new ArrayList<>();//!!
    }
    public int getCustomerId(){
        return customerId;
    }
    public List<BankAccount> getAccountsList(){
        return accountsList;
    }
    public void addAccount(BankAccount account){
        accountsList.add(account);
    }
    public void removeAccount(BankAccount account){
        accountsList.remove(account);
    }
    public void showAccounts(){
        for(BankAccount account:accountsList){
            account.displayAccountInfo();
            //System.out.println("Account: "+account.getAccountNumber()+", balance: "+account.getBalance());
        }
    }
}
