package Oop.properties.polymorphism;

public class Triangle extends Shapes{
    @Override // this annotation is used to tell this method has been overridden
    void area(){
        System.out.println("Hi I'm Triangle");
    }
    double area2(int a, int b){
        return 0.5*a*b;
    }
}
