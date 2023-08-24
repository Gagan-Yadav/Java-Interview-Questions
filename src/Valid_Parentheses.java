import java.util.*;
public class Valid_Parentheses {

//    Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//
//    An input string is valid if:
//
//    Open brackets must be closed by the same type of brackets.
//    Open brackets must be closed in the correct order.
//    Every close bracket has a corresponding open bracket of the same type.
//
//
//    Example 1:
//
//    Input: s = "()"
//    Output: true
//    Example 2:
//
//    Input: s = "()[]{}"
//    Output: true
//    Example 3:
//
//    Input: s = "(]"
//    Output: false

    public static boolean isValid(String s)
    {
        Stack<Character> s1 = new Stack<>();
        for (char c:s.toCharArray())
        {
            if(c=='(' || c=='{' || c=='[')
            {
                s1.push(c);
            }
            else
            {
                if(s1.isEmpty())
                {
                    return false;
                }
            }
            char top=s1.peek();
            if(c==')' && top=='(' || c=='}' && top=='{' || c==']' && top=='[')
            {
                s1.pop();
            }
            else
            {
                if(s1.isEmpty())
                {
                    return false;
                }
            }
        }
        return s1.isEmpty();
    }

    public static void main(String[] args) {

//        System.out.println(isValid("()")); // Output - true
        System.out.print("Enter Parentheses - ");
        Scanner sc = new Scanner(System.in);
        String brackets = sc.next();
        String status = "Not Valid";
        boolean b = isValid(brackets);
        if(b){
            status = "Valid";
        }
        System.out.println("\""+brackets+"\" is "+status);
    }
}
