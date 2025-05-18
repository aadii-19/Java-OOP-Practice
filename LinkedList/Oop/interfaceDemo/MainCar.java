package Oop.interfaceDemo;

public class MainCar {
    // data hiding
    private Engine engine;
    private Brake brake;
    private Media media;

    public MainCar(){
        engine = new PowerEngine();
        brake = new EngineBrake();
        media = new CDplayer();
    }

    public MainCar(Engine engine){
        this.engine = engine;
    }

    public void startEngine(){
        engine.start();
    }

    public void stopEngine(){
        engine.stop();
    }

    public void accelerate(){
        engine.accelerate();
    }
    public void stopCar(){
        brake.brake();
    }

    public void stopBrake(){
        brake.stop();
    }

    public void startMusic(){
        media.start();
    }

    public void stopMusic(){
        media.stop();
    }

    public void changeEngine(Engine engine){
        this.engine = engine;
    }
}
