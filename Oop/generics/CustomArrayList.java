package Oop.generics;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {
    private int[] data;
    private int size = 0;

    public CustomArrayList(){
        int DEFAULT_SIZE = 10;
        this.data = new int[DEFAULT_SIZE];
    }
    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    public int remove(){
        return data[--size];
    }

    public boolean isFull(){
        return size == data.length;
    }

    public int get(int index){
        return data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index, int value){
        data[index] = value;
    }


    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public void resize(){
        int[] temp = new int[data.length*2];
        for(int i=0; i<data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    public static void main(String[] args) {
        CustomArrayList arrayList = new CustomArrayList();
        arrayList.add(15);
        System.out.println(arrayList.toString());
        ArrayList<Integer> list = new ArrayList<>();
        // this <Integer> is known as generics
        System.out.println(list.toString());
    }
}
