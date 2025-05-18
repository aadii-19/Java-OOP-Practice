package LinkedList;

public class customLinkedList {
    private Node head;
    private Node tail;
    private int size;

    // Initialize an empty constructor so that size = 0;

    public customLinkedList() {
        this.size = 0;
    }

    public void display(){
        Node temp = head;  // temp points to head
        while(temp!=null){
            System.out.print(temp.value+"-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void insertFirst(int value) {
        Node node = new Node(value); // Created a new node for the value;
        node.next = head;
        head = node;
        // when inserting into an empty list the head and tail both points at the first node
        if(tail == null){
            tail = head;
        }
        size+=1; //
    }

    public void insert(int index, int value){
        if(index==0){   //--> If first position then we call insertFirst();
            insertFirst(value);
            return;
        }
        if(index==size){
            insertLast(value);
            return;
        }
        // Now check if index goes out of bound
        if(index<0 || index>size){
            System.out.println("Invalid Man");
            return;
        }
        // Now instantiate
        Node node = new Node(value);
        Node temp = head;
        int count = 0; // To keep track of position and count need to be stopped before index-1;
        while(count<index-1){
            temp = temp.next;
            count++;
        }
        // now we have reached at index 2 if we want to insert at 3
        // first assign the new to temp.next;
        node.next = temp.next;
        temp.next = node;
        size++;
    }
    public void insertWithoutTail(int val){
        if(head==null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        Node temp = head;
        while(temp.next != null){  // don't do temp!=null it'll give NullPointerException
            temp = temp.next;
        }
        temp.next = node;
        size+=1;
    }
    // what's the use of Maintaining tail --> it's coz insertion can be done at O(1)
    // if not then traverse till temp==null and then insert there which means O(N)
    public void insertLast(int value){
        if(tail==null){
            insertFirst(value);
            return; // Don't execute below
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size+=1;
    }

    public int getSize(){
        return size;
    }

    public void deleteFirst(){
        if(head==null){  // first check ifEmpty() or not
            System.out.println("List Empty");
            return;
        }
        // Now move the head to the next value
        head = head.next;
        // Now if only one element was there then both head and tail points to that node and if head is moved then it points to null
        // but the tail still points to the deleted node that's messed up bro!
        if(head == null){
            tail = null;
        }
        size-=1;
    }

    public Node reverseList(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public void reverse(){
        head = reverseList(head);
        // fix the tail too;
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        tail = temp;
        tail.next = null;
    }
    public Node get(int index){
        if(index<0 || index>size-1){
            System.out.println("Invalid");
        }
        if(index == 0){
            return head;
        }
        if(index==size-1){
            return tail;
        }
        Node temp = head;
        for(int i=0; i<index; i++){
            temp = temp.next;
        }
        return temp;
    }

    public int find(int value){
        if(head==null){
            System.out.println("List Empty");
            return -1;
        }
        Node temp = head;
        int index = 0;
        while(temp != null){    // here temp.next shouldn't be used as it'll not check the last node
            if(temp.value==value){
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1;
    }

    public Node find2(int value){
        Node temp = head;
        while(temp!=null){
            if(temp.value == value){
                return temp;
            }               // This method only gives node value in hash like LinkedList.customLinkedList$Node@1b28cdfa
            temp = temp.next;
        }
        return null;
    }
    public void delete(int index){
        if(index==0){
            deleteFirst();
            return;
        }
        if(index==size-1){
            deleteLast();
            return;
        }
        int count = 0;
        Node temp = head;
        while(count < index - 1){    // If index at 2 then count stopped at 1
            temp = temp.next;
            count+=1;
        }
        // 1-> 2-> 3-> 4-> null => You want to remove at index 2 so assign a new node to point from 2-> 3
        Node temp2 = temp.next;
        // and then assign the temp i.e. at 2 to point to 3-> 4 so now it's from 2-> 4
        temp.next = temp2.next;
        size-=1;

        //
//        temp.next = temp.next.next; this is way shorter.
    }
    public void deleteLast(){
        if(head==null){  // first check ifEmpty() or not
            System.out.println("List Empty");
            return;
        }
        if(head==tail){
            head = null;
            tail = null;
            size-=1;
        }
        Node temp = head;
        while(temp.next != tail){
            temp = temp.next;
        }
        tail = temp;
        tail.next = null;   // This is really important as after deleting the last node should not point to any node
        size-=1;
    }

    private class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }


}
