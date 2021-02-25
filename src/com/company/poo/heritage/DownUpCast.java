package com.company.poo.heritage;

public class DownUpCast {
    public static void main(String[] args) {
        Account acc = new Account(1001, "Marco Alonso", 2500.00);
        BusinessAccount ba = new BusinessAccount(2001, "SATA", -1500.00, 1000.00);

        //UpCasting
        Account acc1 = ba;
        Account acc2 = new BusinessAccount(2005, "Chip7", 1500.00, 1000.00);
        Account acc3 = new SavingsAccount(2009, "Chip10", 1500.00, 0.09);

        //DownCasting, does not result in objects of the same level;

        BusinessAccount b2 = (BusinessAccount) acc1;

        if (acc3 instanceof BusinessAccount) {
            BusinessAccount b3 = (BusinessAccount) acc3;
            b3.loan(100.00);
            System.out.println("Loan!");
        }
        if(acc3 instanceof SavingsAccount){
            SavingsAccount sa = (SavingsAccount) acc3;
            sa.updateBalance();
            System.out.println("Updated!");
        }
    }

}