import java.util.*;
public class Anagram_String {

    static boolean Anagram(char[] str1, char[] str2)
    {
        int n1 = str1.length;
        int n2 = str2.length;

        if (n1 != n2)
            return false;

        Arrays.sort(str1);
        Arrays.sort(str2);

        for (int i = 0; i < n1; i++)
            if (str1[i] != str2[i])
                return false;

        return true;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);
        String str1 = sc.next().toLowerCase();
        String str2 = sc.next().toLowerCase();

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        if(Anagram(ch1,ch2))
             System.out.println("Anagram");
        else
            System.out.println("Not Anaggr");

    }
}
