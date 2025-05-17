package Oop.interfaceDemo.extendDemo2;

public class Main implements A,B {
    // see even when I have not overridden the method from the A interface it still doesn't show error coz I used Default class
//    @Override
//    public void greet(){}
    public static void main(String[] args) {
        Main main = new Main();
        main.fun();
        main.fun();
        // can't call static methods using subclass but instead with interface only
        // main.getInt();
        // calling static method
        A.getInt();
    }

    // i have default methods in both hence even if i dont give anything it's ok

}
