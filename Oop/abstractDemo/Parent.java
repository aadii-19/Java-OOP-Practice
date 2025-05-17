package Oop.abstractDemo;

public abstract class Parent {
    // you can also use instance variables here
    int age;

    // Abstract Static methods ?? --> NO COZ STATIC CAN'T BE OVERRIDDEN
    Parent(int age){
        this.age = age;
    }

    // can be called in the main method by Parent.Hello();
    static void Hello(){
        System.out.println("Hello");
    }
//    abstract Parent()  -- Abstract constructors are not allowed
    // in the parent class we are not saying what the method does it is upto the child to decide
    abstract void name(String name);
    abstract void partner(String name, int age);
}
