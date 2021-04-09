package com.company.poo.generics.ex3;

import com.company.poo.generics.ex3.entities.Circle;
import com.company.poo.generics.ex3.entities.Rectangle;
import com.company.poo.generics.ex3.entities.Shape;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangle(3.0, 2.0));
        myShapes.add(new Circle(2.0));

        System.out.println("Total Area: " + totalArea(myShapes));

        List<Circle> myCircles = new ArrayList<>();
        myCircles.add(new Circle(2.0));
        myCircles.add(new Circle(3.0));

        System.out.println("Total Area: " + totalArea(myCircles));
    }

    public static double totalArea(List<? extends Shape> list){ //Curinga delimitado (Aceita subtipos de shape)
        double sum = 0.0;
        for(Shape s : list){
            sum += s.area();
        }
        return sum;
    }
}
