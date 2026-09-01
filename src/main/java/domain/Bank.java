package domain;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    public String name;
    public List<Customer> customerList;
    public List<BankAccount> bankAccountsList;
    public Bank(String name){
        this.name=name;
        this.customerList=new ArrayList<>();
        this.bankAccountsList=new ArrayList<>();
    }
    public void addCustomer(Customer c){
        customerList.add(c);
    }
    public void addAccount(BankAccount a){
        bankAccountsList.add(a);
    }
    public void displayCustomers(){
        for(Customer customer:customerList){
            System.out.println("Customer name: " + customer.getName()+", id: "+customer.getCustomerId()+", age: "+customer.getAge()+", email: "+customer.getEmail());
            System.out.println("Accounts: ");
            customer.showAccounts();
            System.out.println();
        }
    }
}
