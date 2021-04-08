package com.company.poo.interfaces.multipleHeritage;

public class ConcretePrinter extends Device implements Printer {
    public ConcretePrinter(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("Printer processing" + doc);

    }

    @Override
    public void printer(String doc) {
        System.out.println("Printing: " + doc);
    }
}
