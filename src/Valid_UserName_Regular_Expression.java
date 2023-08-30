
import java.util.*;
public class Valid_UserName_Regular_Expression {

    public static void main(String[] args) {

        System.out.print("Enter Number of Inputs - ");

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] str = new String[n];

        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }

        String regex = "[a-zA-Z0-9_]+";

//        String check = "gagan";
//        System.out.println(check.contains("@?"));


        boolean isSpecialChar;
        boolean isLength;
        boolean isDigit;


        for (int i = 0; i < str.length; i++) {

            String temp = str[i];
            isSpecialChar = false;
            isLength = false;
            isDigit = true;

            if(temp.length()>7 && temp.length()<=30){

                isLength = true;

                if(temp.matches(regex) && !temp.contains("@?")){
                    // You can  Add more Regex {?#$%^&*":<>';} in contains method.
                    // Make Sure use Escape Sequence (\) for some Special Characters.
                    isSpecialChar = true;

                    char c = temp.charAt(0);
                    if(Character.isDigit(c) ||  c =='_' ){
                        isDigit = false;
                    }
                }
            }

            if(isDigit && isLength && isSpecialChar){
                System.out.println("Valid");
            }else {
                System.out.println("Not Valid");
            }

        }

    }
}


//        Julia
//        Samantha
//        Samantha_21
//        1Samantha
//        Samantha?10_2A
//        JuliaZ007
//        Julia@007
//        _Julia007
