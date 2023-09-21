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
        int size = 0;

        void insertAtEnd(int val){
            Node temp = new Node(val);
            if(head==null){
                head = temp;
            }else{
                tail.next = temp;
            }
            tail = temp;
            size++;
        }

        void insertAtHead(int val){
            Node temp = new Node(val);
            if(head==null){
                insertAtEnd(val);
            }else {
                    temp.next = head;
                    head = temp;
            }
            size++;
        }

        void insertAt(int idx,int val){
            Node tempval = new Node(val);
            Node temp = head;

            if(idx==size){
                insertAtEnd(val);
                return;
            }else if(idx==0){
                insertAtHead(val);
                return;
            } else if (idx<0 || idx>size) {
                System.out.println("Wrong Index");
                return;
            }
            for (int i = 0; i <idx-1; i++) {
                temp = temp.next;
            }
            tempval.next = temp.next;
            temp.next = tempval;
            size++;
        }

        Node getValueAt(int idx){
            Node temp = head;
            if(idx<0 || idx>size){
                System.out.print("Wrong Index Value ");
            }
            for (int i = 0; i <idx; i++) {
                temp = temp.next;
            }
            return temp;
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

        int deleteFirst(){
            int data = head.data;

            if(head.next==null){
                head = tail = null;
            }
            head = head.next;
            size--;
            return data;
        }

        int deleteLast(){
            int data = tail.data;
            if(size<=1){
                return deleteFirst();
            }

          Node secondlast =  getValueAt(size-2);
            tail = secondlast;
            tail.next = null;
            size--;
            return data;
        }

        void deleteAt(int idx) {
            if(idx==0){
                deleteFirst(); // Update tail when deleting the last element
                return;
            } else if (idx==size-1) {
                deleteLast();
                return;
            } else if (idx < 0 || idx >= size) {
                System.out.println("Wrong Index");
                return;
            }

            Node prev = getValueAt(idx-1);
            prev.next = prev.next.next;

        size--;
    }

  /*      int size(){
            // Time Complexity of this function is O(n) thats why we dont use it instead we use size attribute
            int count = 0;
            Node temp = head;
            while (temp!=null){
                count++;
                temp = temp.next;
            }
            return count;
        }
  */

    }
    public static void main(String[] args) {

        linkedlist ll = new linkedlist();

        ll.insertAtEnd(4);
        ll.insertAtEnd(3);
        ll.insertAtEnd(34);
//        ll.insertAtHead(1);
//        ll.insertAtHead(11);
//        ll.insertAt(4,33);
//        ll.insertAt(6,35);
        ll.insertAtEnd(100);
        ll.insertAt(0,90);
        ll.insertAtEnd(27);
        ll.insertAt(3,33);



        ll.display();
        ll.deleteAt(6);
//        ll.deleteAt(1);

//        System.out.println("Deleted Element - "+ll.deleteFirst());
//        System.out.println("Deleted Element - "+ll.deleteLast());
        ll.display();
        System.out.println("Size - "+ll.size);
        System.out.println("("+ll.getValueAt(2).data+")");
        System.out.println("Tail = "+ll.tail.data);
        System.out.println("Head = "+ ll.head.data);
    }
}
