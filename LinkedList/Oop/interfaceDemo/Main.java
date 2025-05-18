package Oop.interfaceDemo;

public class Main{

    public static void main(String[] args) {
        Car main = new Car();
        // if I use Engine main = new Car();
        // then I can't access main.a coz what can be accessed is determined by left(Engine) and it doesn't have `a` in it.
        System.out.println(main.a);
        main.accelerate();
        main.start();
        main.brake();
        main.brake();
    }

}
