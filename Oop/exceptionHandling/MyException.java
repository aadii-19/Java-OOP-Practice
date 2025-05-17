package Oop.exceptionHandling;

public class MyException extends Exception{
    // we extend with Exception cuz every exception extends the exception class
    public MyException(String message){
        super(message);
        System.out.println("Error");
    }
}
