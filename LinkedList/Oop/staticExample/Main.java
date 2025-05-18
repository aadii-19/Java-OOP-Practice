package Oop.staticExample;

public class Main {
    public static void main(String[] args) {
        Human Adith = new Human(19,"Adith", 100000, false);
        Human Kunal = new Human(25,"Kunal", 200000, true);
        System.out.println(Adith.age);
        System.out.println(Kunal.age);
        System.out.println(Human.population);
        System.out.println(Human .population);
        // making a new object so that i can call the non-static function inside static
        Main main = new Main();
        // calling with the object
        main.fun();
    }
    static void message(){
        System.out.println("hi");
        // System.out.println(this.age); can't use this in static as this is for objects
    }
    //non-static can be called inside a non-static but can't be called in a static function
    //without making an object
    //non-static belongs to object
    void fun(){
        greeting();
    }
    void greeting(){
        System.out.println("Hey");
    }
}
