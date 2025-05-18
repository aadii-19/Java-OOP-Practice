package Oop.properties.inheritance;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(10,20,30);
        System.out.println(box.h+" "+box.w+" "+box.l);
        Box box1 = new Box(box);
        // since I only gave the bx_wt as the parameter
        // for the constructor it displays 40 else displays
        rectangle rec = new rectangle(20,30,90,40);
        box.display();
        System.out.println(box1.h);
        System.out.println(rec.box_weight);
        // Making a reference of the parent class and making an object of the rectangle class
        Box obj5 = new rectangle(6);
         /*
         When I try to access the child class attribute is shows error coz the scope is based on the reference
         it is the type of reference and not the type of object that determines the members that can be accessed
         System.out.println(obj5.box_weight); can't access this
         rectangle obj6 = new Box(10,3,5,6);  --> this shows that even you can't use a child reference and parent
         obj coz parent has no idea about the child attributes
          */
        RectanglePrice obj7 = new RectanglePrice(5,6,7,8,9);
        // by this the static method in RectanglePrice is first checked
        // if not present then it checks in the above super classes until the top class
        // obj7.greeting(); //by convention access the static class only with the class name


    }
}
