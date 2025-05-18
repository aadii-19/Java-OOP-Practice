package Oop.singleton;

public class Singleton {
    private Singleton(){
        // constructor but this should not be accessed by outside
        System.out.println("Constructor Initialised");
    }
    // creating an instance here itself coz it is private
    private static Singleton instance;

    //
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
