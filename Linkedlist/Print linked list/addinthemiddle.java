import java.util.LinkedList;

public class addinthemiddle {
    public static class Node{
        int data; Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public void addFirst(int data){
        //Step1. create new node
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        //Step 2- newNode.next = null
        newNode.next = head; //Link
        //Step 3- head = newNode
        head = newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
         if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;

        }
        System.out.println("null");
    }
    public void add(int idx, int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head; int i =0;
        while(i<idx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public static void main(String args[]){
        printLinkedList ll = new printLinkedList(); 
        ll.print();
        ll.addFirst(1); 
        ll.print();
        ll.addLast(2); 
        ll.print();
        ll.addLast(3); 
        ll.print();
        ll.addLast(4);
        ll.add(2,9);
        ll.print();
    }
}
