package Oop.objectCloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human Kunal = new Human(34, "Kunal");
        Human Ronit = (Human) Kunal.clone();
        System.out.println(Ronit.age + " " + Ronit.name);
        // Ronit copies the age and name from Kunal
        // but this takes more processing time as new keyword is used
        System.out.println(Arrays.toString(Ronit.arr));
        // I'm changing in Ronit
        Ronit.arr[0] = 100;
        // Now see what kunal will have
        System.out.println(Arrays.toString(Kunal.arr));
        // [100, 2, 3, 4, 5] --> This is Shallow copying
    }
}
