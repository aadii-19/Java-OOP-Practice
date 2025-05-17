package Oop.interfaceDemo.extendDemo2;

public interface A {
    // static interface methods should always have a body coz they can't be interfaced or inherited
    static void getInt(){
        System.out.println("Hellooo");
    }
    // from java 8 it allows default methods in interfaces
    default void fun(){
        System.out.println("I'm in A");
    }
}
