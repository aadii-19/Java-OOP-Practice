package Oop.interfaceDemo;

public class RealCar{
    public static void main(String[] args) {
        MainCar car = new MainCar();
        car.startEngine();
        car.stopEngine();
        car.startMusic();
        car.stopMusic();
        car.accelerate();
        car.stopCar();
        car.stopBrake();
        ElectricEngine electric = new ElectricEngine();
        // engine changing from Power to Electric
        car.changeEngine(new ElectricEngine());
        car.startEngine();
        car.stopEngine();
    }
}
