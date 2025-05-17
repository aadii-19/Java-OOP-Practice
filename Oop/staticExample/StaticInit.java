package Oop.staticExample;
// this is a demo to show initialisation of static variables
public class StaticInit {
    static int a = 4;
    static int b;

    // the static block will execute exactly once when the class is loaded
    static{
        System.out.println("I'm gay");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticInit obj = new StaticInit();
        // for accessing a static use the class name and not obj name as it's static
//        System.out.println(obj.a+" "+obj.b);
        System.out.println(StaticInit.a+" "+StaticInit.b);
        StaticInit.b += 3;
        System.out.println(StaticInit.b);

        // creating another object
        StaticInit obj2 = new StaticInit();
        System.out.println(obj2.b);

//         I'm gay
//        4 20
//        23
//        23 see the "I'm" part only runs first that's what it means when they say the
//        static block only runs once when the first object is created
    }
}
