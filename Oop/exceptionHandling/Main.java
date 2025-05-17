package Oop.exceptionHandling;

public class Main {
    public static void main(String[] args) {
        try {
            InvalidUser("Kunal");
            System.out.println(divide(5,0));
//            throw new Exception();  --> This mimics the exception so we are just giving one to see if the exception catches it or not
        }
        catch (MyException e){
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException e) {
            System.out.println("ARITHMETIC_EXCEPTION :"+e.getMessage());
        }
        catch(Exception f){
            System.out.println(f.getMessage());
        }
        // Executes anyway
        finally{
            System.out.println("Executed");
        }
    }

    static int divide(int a, int b){
        if(b==0){
            // throw exception from here itself
            throw new ArithmeticException("Division by Adith");
        }
        return a/b;
    }

    static void InvalidUser(String name) throws MyException{
        if(name.equals("Kunal")) {
            throw new MyException("Kunal name");
        }
    }
}
