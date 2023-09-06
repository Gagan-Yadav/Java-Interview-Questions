import java.util.Stack;

public class Decode_String
{
    public static void main(String[] args)
    {
        String str1="a2b4c9";
        System.out.println(decodeString(str1));

    }

    public static String decodeString(String str1)
    {
        Stack<String> st=new Stack<>();
        StringBuilder sb=new StringBuilder();

        for(char ch: str1.toCharArray())
        {
            if(Character.isAlphabetic(ch))
            {
                st.push(String.valueOf(ch));
            }
            else if(Character.isDigit(ch))
            {
                String temp= st.pop();
                int num=Integer.parseInt(String.valueOf(ch));
                for(int i=1;i<=num;i++)
                {
                    sb.append(temp);
                }
            }
            
        }
        return sb.toString();

    }
}