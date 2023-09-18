import java.awt.event.ItemEvent;
import java.util.*;
public class Linked_List_Implementation {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
    public static class linkedlist{
        Node head = null;
        Node tail = null;

        void insertAtEnd(int val){
            Node temp = new Node(val);
            if(head==null){
                head = temp;
            }else{
                tail.next = temp;
            }
            tail = temp;
        }

        void insertAtHead(int val){
            Node temp = new Node(val);
            if(head==null){
                insertAtEnd(val);
            }else {
                    temp.next = head;
                    head = temp;
            }
        }
        void display(){
            Node temp = head;
            while (temp!=null)
            {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }

        int size(){
            int count = 0;
            Node temp = head;
            while (temp!=null){
                count++;
                temp = temp.next;
            }
            return count;
        }

    }
    public static void main(String[] args) {

        linkedlist ll = new linkedlist();

        ll.insertAtEnd(4);
        ll.insertAtHead(0);
        ll.insertAtEnd(3);
        ll.insertAtHead(34);
        ll.insertAtHead(1);


        ll.display();
        System.out.println("Size - "+ll.size());
    }
}
