package Oop.objectCloning;

public class CustomArrayList <T>{
    private Object[] data;
    private int size = 0;
    private static final int DEFAULT_SIZE = 10;

    public CustomArrayList(){
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
        System.arraycopy(data, 0, temp, 0, data.length);
        data = temp;
    }

    public T remove(){
        return (T) data[--size];
    }

    public T getValue(int index){
        return (T) data[index];
    }

    public int getIndex(T value){
        for(int i=0; i< data.length; i++){
            if(data[i].equals(value)){
                return i;
            }
        }
        return -1;
    }

    public void set(int index, T value){
        data[index] = value;
    }
}
