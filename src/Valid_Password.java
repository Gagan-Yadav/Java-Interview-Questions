import java.util.*;
public class Valid_Password {
    static public boolean check(String str)
    {
        boolean HasUppercase=false;
        boolean Haslowercase=false;
        boolean HasDigit=false;
        boolean Hasspecialsymbol=false;
        String Specialchar="!@#$%&";

        if(str.contains(" "))
        {
            return false;
        }
        if(str.length()>=8 && str.length()<=15)
        {

            for(char c: str.toCharArray())
            {
                if(Character.isUpperCase(c))
                {
                    HasUppercase=true;
                }
                else if(Character.isLowerCase(c))
                {
                    Haslowercase=true;
                } else if (Character.isDigit(c))
                {
                    HasDigit=true;
                } else if (Specialchar.contains(String.valueOf(c)))
                {
                    Hasspecialsymbol=true;
                }
            }
            return Hasspecialsymbol && Haslowercase && HasUppercase && HasDigit;
        }
        return false;
    }

    public static void main(String[] args) {

//        System.out.println(check("Gagan@1234")); //output - true
        System.out.print("Enter Password - ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean b = check(s);
        String status = "Not Valid";
        if(b){
            status="Valid";
        }
        System.out.println("Password "+"\""+s+"\""+" is "+status+".");
    }
}
