package Oop.generics;


import java.util.Arrays;
import java.util.List;

// <T extends Number> this restricts what can be put and this is known as Java WildCards
// Here T should be either be number class or it's subclass
public class WildcardExample<T extends Number> // this means any type given
{

// --> You can't create an instance of a generic type coz during compile time the byteCode doesn't have any idea about the <T>
    // Therefore we make this Object class
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public WildcardExample(){
        this.data = new Object[DEFAULT_SIZE];
    }

    // If you only want a certain class to access this method
    public void getList(List<Number> list){
        // do something
        // here only number is allowed
    }

    // if you want subclass of number also then
    public void gettList(List <? extends Number> list){
        // do something
        // here even the subclasses of the main class is allowed
    }
    public void add(T value){
        if(isFull()){
            resize();
        }
        data[size++] = value;
    }

    public boolean isFull(){
        return size == data.length;
    }

    public void resize(){
        Object[] temp = new Object[data.length * 2];
        for(int i=0; i< data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    @SuppressWarnings("unchecked")
    public T remove(){
        return (T)(data[--size]);
    }

    public int size(){
        return size;
    }
    @Override
    public String toString() {
        return "CustomGenericArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public T get(int index){
        return (T)(data[index]);
    }

    public void set(int index, T value){
        data[index] = value;
    }

    public static void main(String[] args) {
        WildcardExample<Integer> list = new WildcardExample<>();
        // only of the number class is allowed
    }

}
