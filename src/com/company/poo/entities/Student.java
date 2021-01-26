package com.company.poo.entities;

public class Student {
    public String name;
    public double firstGrade;
    public double secondGrade;
    public double thirdGrade;


    public double finalGrande(){
        return firstGrade + secondGrade +thirdGrade;
    }

    public double missingPoints(){
        if(finalGrande() < 60.00){
            return 60.00 - finalGrande();
        }
        else{
            return 0.00;
        }
    }
    public String situation(){
        if(finalGrande() < 60.00){
            return "FAILED";
        }
        else{
            return "PASS";
        }
    }
    public String toString(){
        if(finalGrande() < 60.00) {
            return "FINAL GRADE: " + String.format("%.2f", finalGrande()) +
                    "\n" + situation() + "\nMISSING " + String.format("%.2f", missingPoints()) + " POINTS";
        }
        else{
            return "FINAL GRADE: " + String.format("%.2f", finalGrande()) +
                    "\n" + situation();
        }
    }
}
