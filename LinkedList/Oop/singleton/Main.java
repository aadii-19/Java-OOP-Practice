package Oop.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();

        // see the output is shown only once which means no matter how many ref variables all point to the one object
    }
}
