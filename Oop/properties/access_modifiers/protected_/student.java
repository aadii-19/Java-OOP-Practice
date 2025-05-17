package Oop.properties.access_modifiers.protected_;

public class student {
    protected int height;
    int weight;
    int age;

    public student(){
        this.age = 0;
        this.height = 40;
        this.weight = 40;
    }

    public static void main(String[] args) {
        student student1 = new student();
        student1.height = 1;
        // since we are using this in the same class protected can be accessed
        System.out.println(student1.height);
    }
}
