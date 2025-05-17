package Oop.properties.polymorphism;

public class Main {
    public static void main(String[] args) {
        // can use a parent and a child as child has everything a parent has
        Shapes shape = new Square();
        // ^ see here the method being called depends on Square(object-->right side) & this is known as "UPCASTING"
        // --> What it is able to access is defined by the reference(left) and which one it accesses is defined by object(right)
        Triangle obj2 = new Triangle();
        // Output --> Hi I'm Square from this it is understood it executes from the object method i.e. in the right
        //Square square = new Shapes();
        // here the area() is same but does diff things this is polymorphism
        System.out.println(obj2.area2(4,5));
    }
}
