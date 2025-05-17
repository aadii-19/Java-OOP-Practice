package Oop.abstractDemo;

public class Son extends Parent{

    public Son(int age){
        super(age);
    }
    // in order to extend an abstract class all the abstract methods should be overridden
    @Override
    void name(String name){
        System.out.println("I'm gonna crack GOOGLE");
    }
    @Override
    void partner(String name, int age) {
        System.out.println("I like "+name+"She is "+age+".");
    }
}
