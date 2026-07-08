package Linkedlist;
import java.util.LinkedList;
public class removefirstinLinkedList {
    public static class Node{
        int data; Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data){
        //Step1. create new node
        Node newNode = new Node(data);
        size++;
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
        size++;
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
        size++;
        Node temp = head; int i =0;
        while(i<idx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public int removefirst(){
        if(size==0){
            System.out.println("LL IS EMPTY");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val = head.data;
            head = tail =null;
            size=0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;

        return val;
    }
    public static void main(String args[]){
        removefirstinLinkedList ll = new removefirstinLinkedList();  // ✅ Dono side same class        
        ll.addFirst(1); 
        ll.addLast(2); 
        ll.addLast(3); 
        ll.addLast(4);
        ll.add(2,9);
        ll.print();
        System.out.println(ll.size);
        ll.removefirst();
        ll.print();
        System.out.println(ll.size);
    }
}

