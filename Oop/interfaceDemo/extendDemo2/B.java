package Oop.interfaceDemo.extendDemo2;

public interface B {
    // we are not implementing but extending A class
    default void greet(){
        System.out.println("Greet");
    }
    // from java 8 it allows default methods in interfaces
//    default void fun(){
//        System.out.println("I'm in A");
//    }
}

