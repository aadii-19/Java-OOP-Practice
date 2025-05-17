package Oop.interfaceDemo;

public class PowerEngine implements Engine{
    public void start(){
        System.out.println("PowerEngine ON");
    }
    public void stop(){
        System.out.println("PowerEngine OFF");
    }
    public void accelerate(){
        System.out.println("PowerEngine Accelerate");
    }
}
