package LinkedList;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insert(int index, int val) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index <0 || index > size) {
            System.out.println("Invalid");
            return;
        }
        int count = 0;
        Node node = new Node(val);
        Node temp = head;
        while (count < index - 1) {
            temp = temp.next;
            count++;
        }

        node.next = temp.next; // First we give the new node where to point
        temp.next = node; // Then we give the prev node the new node
        // If we did the opposite then temp will point to new node then temp will point to node
        // and then node.next = temp.next but temp.next is already node so this gives a SELF_LOOP;
        size++;

    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size += 1;
    }

    public void insertWithoutTail(int val) {
        if (head == null) {
            insertFirst(val);
            return;
        }
        Node temp = head;
        Node node = new Node(val);
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        size += 1;
    }

    public int getSize() {
        return size;
    }

    public void display() {
        if (head == null) {
            System.out.println("null");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    private class Node {
        int value;
        Node next;

        public Node(int val) {
            this.value = val;
        }

        public Node(int val, Node next) {
            this.value = val;
            this.next = next;
        }
    }
}
