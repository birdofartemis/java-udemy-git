package com.company.poo.interfaces.multipleHeritage;

public class Main {
    public static void main(String[] args){
        //This is not multiple heritage. We are implementing multiple interfaces.

        ConcretePrinter p = new ConcretePrinter("1080");
        p.processDoc("My Letter");
        p.printer("My Letter");
        System.out.println();

        ConcreteScanner s = new ConcreteScanner("2003");
        s.processDoc("My Email");
        System.out.println("Scan result: " + s.scan());
        System.out.println();

        ComboDevice c = new ComboDevice("2081");
        c.processDoc("My dissertation");
        c.printer("My dissertation");
        System.out.println("Scan result: " + c.scan());
    }
}
