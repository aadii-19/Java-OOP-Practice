package Oop.interfaceDemo;

import java.sql.SQLOutput;

public class ElectricEngine implements Engine {
    public void start(){
        System.out.println("ELECTRIC On");
    }
    public void stop(){
        System.out.println("ELECTRIC Off");
    }
    public void accelerate(){
        System.out.println("ELECTRIC Accelerate");
    }
}
