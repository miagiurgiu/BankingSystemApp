package org.example;

import domain.*;

public class Main {
    static void main() {
        Bank b1=new Bank("BCR");
        Customer c1=new Customer("Mia",19,"maria@gmail.com",1);
        Customer c2=new Customer("Magda",30,"magdalena@gmail.com",2);

        BankAccount savings1=new SavingsAccount(10013,2299.3,c1,5);
        BankAccount current1=new CurrentAccount(29910,6900,c1,500);
        c1.addAccount(savings1);
        c1.addAccount(current1);
        current1.withdraw(200);
        System.out.println("Show accounts for: "+c1.getName());
        c1.showAccounts();

        BankAccount account1=new SavingsAccount(999,60000.50,c2,7);
        BankAccount account2=new CurrentAccount(6767,8100,c2,600);
        c2.addAccount(account1);
        c2.addAccount(account2);

        System.out.println();
        System.out.println("Display account info for: "+c2.getName());
        account1.displayAccountInfo();
        account2.displayAccountInfo();

        System.out.println();
        System.out.println("Display customers with their accounts for: "+b1.name);
        b1.addCustomer(c1);
        b1.displayCustomers();


        System.out.println();
        System.out.println("Display customers with their accounts (after adding customer + "+c1.getName()+")+ for: "+b1.name);
        b1.displayCustomers();

        b1.addCustomer(c2);
        System.out.println();
        System.out.println("Display customers with their accounts (after adding both customers) for: "+b1.name);
        b1.displayCustomers();

        b1.addAccount(savings1);
        b1.addAccount(current1);
        System.out.println("Display customers with their accounts (after adding all accounts) for: "+b1.name);
        b1.displayCustomers();

        Person person=new Person();
    }
}
