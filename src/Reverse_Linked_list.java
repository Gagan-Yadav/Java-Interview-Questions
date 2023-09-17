import java.util.*;
public class Reverse_Linked_list {

    public static void display(Node head){
        while (head!=null){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }

    public static void display_reverse(Node head){
        if(head==null) return;
        display_reverse(head.next);
        System.out.print(head.data+" ");
    }
    
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
      Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        System.out.print("Original Linked List - "); // 1 2 3 4 5
        display(a);
        System.out.print("\nReversed Linked List - "); // 5 4 3 2 1
        display_reverse(a);

        
//        System.out.println(a.data); //1
    }
}
