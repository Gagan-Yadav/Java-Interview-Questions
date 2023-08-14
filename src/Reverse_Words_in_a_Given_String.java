import java.util.*;
import java.util.concurrent.ScheduledExecutorService;

public class Reverse_Words_in_a_Given_String {

    static String check(String str){
        String[] rev=null;
       rev = str.trim().split("\\s");
       String str2="";
        for (int i = rev.length-1; i >= 0 ; i--) {
                str2 +=rev[i]+" ";
        }
        return str2;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        System.out.println("Original String - "+str);

        System.out.println("Reversed String - "+ check(str));
    }
}
