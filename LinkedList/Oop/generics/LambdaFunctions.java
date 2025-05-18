package Oop.generics;

public class LambdaFunctions {
    public static void main(String[] args) {
        Operation sum = (a,b) -> a + b;
        Operation prod = (a,b) -> a * b;
        Operation diff = (a,b) -> a - b;
        LambdaFunctions myfun = new LambdaFunctions();
        System.out.println(myfun.operate(5,3,sum));
        System.out.println(myfun.operate(5,3,diff));
        System.out.println(myfun.operate(5,3,prod));

    }
    private int operate(int a, int b, Operation op){
        return op.operation(a,b);
    }
}
interface Operation{
     int operation(int a, int b);
}
