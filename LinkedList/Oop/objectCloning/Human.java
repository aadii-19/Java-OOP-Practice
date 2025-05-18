package Oop.objectCloning;

public class Human implements Cloneable{
    int age;
    String name;
    int[] arr;

    public Human(int age, String name){
        this.age = age;
        this.name = name;
        this.arr = new int[]{1,2,3,4,5};
    }

    public Human(Human other){
        this.age = other.age;
        this.name = other.name;
    }

//    public Object clone() throws CloneNotSupportedException{
//        return super.clone();
//    }

    // Do a deep copy of the object
    public Object clone() throws CloneNotSupportedException{
        Human twin = (Human) super.clone();
        // we got the shallow copy here and now declare a new array for twin and copy the clone into twin
        twin.arr = new int[twin.arr.length]; // a new array of twin.length
        System.arraycopy(this.arr, 0, twin.arr, 0, twin.arr.length);
        return twin;
    }
}
