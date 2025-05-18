package Oop.generics.comparing;

public class Student implements Comparable<Student> {
    int roll;
    float marks;

    public Student(int roll, float marks){
        this.roll = roll;
        this.marks = marks;
    }

    public String toString(){
        System.out.println("Comparing bish");
        return marks + " ";
    }

    public int compareTo(Student o){
        return Float.compare(this.marks,o.marks);
    }
}
