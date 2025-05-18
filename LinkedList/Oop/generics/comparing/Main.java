package Oop.generics.comparing;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student Kunal = new Student(12,87.54f);
        Student Sachin = new Student(14, 98f);
        Student ROhit = new Student(17, 93.8f);
        Student Mayank = new Student(10, 89.8f);
        Student Heronk = new Student(34, 76.34f);
        Student Merank = new Student(13, 38.23f);

        Student[] list = {Kunal,Sachin,ROhit,Mayank,Heronk,Merank};
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
        // here java doesn't know what to compare
//        if(Kunal < Sachin){
//            System.out.println("Sachin has more marks");
//        }

        System.out.println(Kunal.compareTo(Sachin));
        // we get -1 coz this(kunal) is less than o(Sachin)
    }
}
