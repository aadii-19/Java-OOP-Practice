package Oop.interfaceDemo;

public class Car implements Engine, Brake{
    int a = 10;
    public void start(){
        System.out.println("I Start Bro");
    }
    public void stop(){
        System.out.println("I Stop Bro");
    }
    public void brake(){
        System.out.println("I Brake Bro");
    }
    public void accelerate(){
        System.out.println("I Accelerate Bro");
    }

}
