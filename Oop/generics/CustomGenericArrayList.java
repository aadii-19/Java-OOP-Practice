package Oop.generics;


import java.util.Arrays;

public class CustomGenericArrayList<T> // this means any type given
{

// --> You can't create an instance of a generic type coz during compile time the byteCode doesn't have any idea about the <T>
    // Therefore we make this Object class
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomGenericArrayList(){
        this.data = new Object[DEFAULT_SIZE];
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
        CustomGenericArrayList<Integer> list = new CustomGenericArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        for(int i= list.size()-1; i<10; i++){
            list.add(i+1);
        }
        System.out.println(list);
    }

}
