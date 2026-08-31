package org.example;

import domain.BankAccount;
import domain.CurrentAccount;
import domain.Customer;
import domain.SavingsAccount;

public class Main {
    static void main() {
        Customer c1=new Customer("Mia",19,"maria@gmail.com",1);
        BankAccount savings1=new SavingsAccount(10013,2299.3,c1,5);
        BankAccount current1=new CurrentAccount(29910,6900,c1,500);
        c1.addAccount(savings1);
        c1.addAccount(current1);
        current1.withdraw(200);
        c1.showAccounts();

    }
}
