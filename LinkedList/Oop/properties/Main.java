package Oop.properties;

import Oop.interfaceDemo.MainCar;
// using MainCar class that used interfaces
public class Main {
    public static void main(String[] args) {
        MainCar car = new MainCar();
        car.stopCar();
        car.startEngine();
    }
}
