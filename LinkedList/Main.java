package LinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        customLinkedList list1 = new customLinkedList();
        list1.insertFirst(2);
        list1.insertFirst(1);
        list1.insertLast(3);
        list1.insertWithoutTail(4);
        list1.insert(2,5);
        System.out.println("Index at : "+list1.find(5));
        list1.display();
        System.out.println(list1.getSize());

    }
}
