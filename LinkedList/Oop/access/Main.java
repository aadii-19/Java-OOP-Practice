package Oop.access;

import java.util.ArrayList;

public class Main{

    public static void main(String[] args) {
        A obj = new A(12,"Kunal");
        // it is important to label variables as private to limit their manipulation
        // setting the private variable using setter
        obj.setnum(24);
        // getting the private variable using getter
        System.out.println(obj.getNum());


       // list.DEFAULT_CAPACITY;  --> see this has private access in java
    }
}
