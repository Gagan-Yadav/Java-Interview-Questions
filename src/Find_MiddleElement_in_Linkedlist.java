import java.util.*;
public class Find_MiddleElement_in_Linkedlist {
       public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        list.add(27);
        list.add(10);
        list.add(26);
        list.add(2);
        list.add(12);

        int middle = list.size()/2;
           System.out.println("Middle Element - "+list.get(middle));
    }
}
