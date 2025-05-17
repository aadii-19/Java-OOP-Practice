package Oop.properties.access_modifiers.protected_;

public class Main extends student{
    public static void main(String[] args) {
        Main student2 = new Main();
        // can't access by keeping the parent also coz when it checks for
        // parent class then it'll show protected
        // java: height has protected access in Oop.properties.access_modifiers.protected_.student
        student2.height = 1;
        // since we are using this in the same package protected can be accessed
        System.out.println(student2.height);
    }
}
