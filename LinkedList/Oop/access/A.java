package Oop.access;

public class A {
    private int num;
    public String name;
    protected int[] arr;

    public A(int num, String name){
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }

    // to access private variables we set setter and getters
    public void setnum(int num){
        this.num = num;
    }

    public int getNum(){
        return num;
    }
}
