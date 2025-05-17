package Oop.interfaceDemo;

public class CDplayer implements Media{
    // since if we just implement everything even if we use the music object it will only display "ENGINE TURNED OFF"
    // so create separate interfaces and then extend them into the MainCar
    public void start(){
        System.out.println("Music Start");
    }
    public void stop(){
        System.out.println("Music Stop");
    }
}
