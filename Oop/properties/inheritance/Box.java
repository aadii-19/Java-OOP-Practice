package Oop.properties.inheritance;

public class Box {
    double l;
    double h;
    double w;
    double box_weight = 11;
    // creating a constructor without any variables
    static void greeting(){
        System.out.println("Hi I'm the box Constructor");
    }
    public Box() {
        System.out.println("Parent constructor"); // it's not giving an error coz super calls the object class
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    public Box(double h, double w) {
        this.h = h;
        this.w = w;
        this.l = -1;
    }

    public Box(double h, double w, double l) {
        this.h = h;
        this.l = l;
        this.w = w; // can give this in any order
    }

    // copy constructor
    public Box(Box old) {
        this.h = old.h + 10; // added 10 to the original value
        this.l = old.h;
        this.w = old.w;
    }

    public void display() {
        System.out.println("Class instantiated");
        System.out.println(this.h);
        System.out.println();
    }
}

class rectangle extends Box {
    double box_weight;
    static void greeting(){
        System.out.println("I'm rectangle class");
    }
    rectangle(){
        super();
        this.box_weight = -1;
    }
    public rectangle(double box_weight) {
        this.box_weight = box_weight;
    }
    rectangle(rectangle other){
        super(other);
        // here by using super(other) we are passing other in the box copy constructor
        // so now it is like Box obj = new rectangle(h,l,w,box_weight);
        box_weight = other.box_weight;
    }
    public rectangle(double h, double l, double w,double box_weight) {
        // so now we call from the parent class using the super
//        super(h,w,l);
        // by using super we print the weight value given in the
        // first assign using this keyword
        super(h,l,w);
        System.out.println("Child Class");
        this.box_weight = box_weight;
        System.out.println(this.h);

    }
}
