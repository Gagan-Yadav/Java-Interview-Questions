import java.util.*;
public class CaseChage_in_String {

    //input - hiiMyNameIsGagan
    //Output
//    hII
//    mY
//    nAME
//    iS
//    gAGAN


    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();

        List<String> words=new ArrayList<>();
        StringBuilder currentword=new StringBuilder();

        for (char c:input.toCharArray())
        {
            if(Character.isUpperCase(c))
            {
                words.add(currentword.toString());
                currentword=new StringBuilder();
            }
            currentword.append(c);
        }
        words.add(currentword.toString());
        for (int i = 0; i <words.size() ; i++)
        {
            String word=words.get(i);
            if(i!=0)
            {
                System.out.println(word.substring(0,1).toLowerCase()+word.substring(1).toUpperCase());
            }
            else
            {
                System.out.println(word.substring(0,1).toLowerCase()+word.substring(1).toUpperCase());
            }
        }
    }
}
