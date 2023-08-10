import java.util.*;

public class Round_Number {
    public static boolean isHappy(int n)
    {
        HashSet<Integer> s=new HashSet<>();
        while (n!=1 && !s.contains(n))
        {
            s.add(n);
            n=squaresum(n);
        }
        return n==1;
    }
    public static int squaresum(int n) {
        int sum=0;
        while (n > 0)
        {
            int temp=n%10;
            sum+=(temp*temp);
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args)
    {
        int n=19;
        System.out.println(isHappy(n));
    }
}