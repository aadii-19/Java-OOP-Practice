package Oop.abstractDemo;

public class Daughter extends Parent {
    Daughter(int age){
        super(age);
    }
    void name(String name){
        System.out.println("I'm gonna crack FAANG");
    }
    void partner(String name, int age){
        System.out.println("I love him "+name+age);
    }
}
