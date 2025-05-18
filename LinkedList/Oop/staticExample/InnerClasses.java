package Oop.staticExample;

// outside classes cannot be static if static error shown

import java.util.Arrays;

public class InnerClasses {
    // by making static the test is not dependent on the object of InnerClasses
    static class Test {
        /*
        if I take the static from the string then it will be dependent on the object that is created in the test so
        the string will be different for each object and output will be rahul and kunal
         */
        String name;

        public Test(String name) {
            this.name = name;
        }
        /*
        We can add our own toString() method to the Test class to get a better output
         */
        public String toString(){
            return name;
        }
    }

    public static void main(String[] args) {
        // see we can't access test because the test itself is
        // dependent on the InnerClasses
        Test a = new Test("Kunal");
        // we get error because we are trying to access the test which is dependent on outer class
        Test b = new Test("Rahul");
        // this is how we can access the inner class
        System.out.println(a.name);
        System.out.println(b.name);

        Arrays.toString(new int[]{1, 2, 3});

        System.out.println(a);
        /*
        Oop.staticExample.InnerClasses$Test@65ab7765 here output is like this coz test method doesn't have
        toString method so it is taking the default toString method from the object class with hex value
        public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
        } this is being called here
         */

        /*
        Here in the first sout the static string is kunal then it is changed to rahul so in the output both rahul
        b.name is test.name
         */

    }
}
        /*
        Since the static doesn't depend on objects and objects are created at runtime therefore the static class
        is created at compile time and the non-static class is created at runtime
         */