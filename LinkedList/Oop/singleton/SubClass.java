package Oop.singleton;

import Oop.access.A;

import java.util.Arrays;

public class SubClass extends A {
    public SubClass(int num, String name){
        super(num,name);
    }
    // another subclass which extends the SubClass class can also access the protected variable
    public static void main(String[] args) {
        SubClass subClass = new SubClass(12, "Kunal");
       // The array is protected but can still be called by the subclass extending the main class
        System.out.println(Arrays.toString(subClass.arr));
    }
}
