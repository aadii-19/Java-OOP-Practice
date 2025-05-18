package Oop.interfaceDemo;

public interface Engine {
    // if you want to declare any variable it is static and final by default
    int price = 75000;
    // all engines have 3 methods start, stop and accelerate
    void start();
    void stop();
    void accelerate();
}
