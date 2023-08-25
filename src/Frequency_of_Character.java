import java.util.*;
public class Frequency_of_Character {
    public static void countoccurence(String s)
    {
        HashMap<Character,Integer> map=new HashMap<>();

        int max =0;
        char maxc = ' ';
        char[] c=s.toCharArray();
        for(char ch:c)
        {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            }
            else
            {
                map.put(ch,1);
            }
        }
        for(Map.Entry<Character, Integer> entry: map.entrySet())
        {
            System.out.println("key="+entry.getKey()+",value="+entry.getValue());
            if(entry.getValue()>=max){
                max = entry.getValue();
                maxc = entry.getKey();
            }
        }
        System.out.println("Max occurring character is \""+maxc+"\" , "+max+" times");
    }
    
    public static void main(String[] args)
    {

//        String name ="gagan";
//        countoccurence(name);
//        output -
//                key=a,value=2
//                key=g,value=2
//                key=n,value=1
//                Max occurring character is "g" , 2 times

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String - ");
        String str = sc.nextLine();
        countoccurence(str);

    }
}
