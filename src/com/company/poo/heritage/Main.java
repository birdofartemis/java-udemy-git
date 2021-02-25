package com.company.poo.heritage;

public class Main {
    public static void main(String[] args) {
        Account acc1 = new Account(2001, "Marco Alonso", 200.00);
        acc1.withdraw(100);
        System.out.println(acc1.getBalance());

        Account acc2 = new SavingsAccount(2002, "Alonso", 200.00, 0.9);
        acc2.withdraw(100);
        System.out.println(acc2.getBalance());

        Account acc3 = new BusinessAccount(2002, "Alonso", 200.00, 200.00);
        acc3.withdraw(100);
        System.out.println(acc3.getBalance());
    }
}
