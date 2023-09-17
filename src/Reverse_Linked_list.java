import java.util.*;
public class Reverse_Linked_list {

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

        Node temp = a;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        
//        System.out.println(a.data); //1
    }
}
