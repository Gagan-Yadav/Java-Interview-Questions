import java.util.*;
public class Reverse_Linked_list {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.push(3);
        list.add(0,0);
        
        System.out.println(list);
    }
}
