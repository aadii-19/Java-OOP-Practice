package Oop.interfaceDemo;

public class EngineBrake implements Brake{
    public void brake(){
        System.out.println("Engine Brake applied");
    }
    public void stop(){
        System.out.println("Engine Brake Removed");
    }
}
