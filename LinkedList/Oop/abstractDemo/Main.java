package Oop.abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(30);
        Daughter daughter = new Daughter(25);

        // can we create an object for abstract class?
//        Parent mom = new Parent(34);  --> 'Parent' is abstract; cannot be instantiated
        // We can't create obj for abstract coz if we call partner for parent class it is not defined in the first place

//        son.name("Kunal");
//        daughter.name("Riya");
//        son.partner("Lavanya", 25);
//        daughter.partner("Rohith", 24);
    }
}
