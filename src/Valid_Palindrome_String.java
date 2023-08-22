public class Valid_Palindrome_String {


//    A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
//
//    Given a string s, return true if it is a palindrome, or false otherwise.
//
//
//
//            Example 1:
//
//    Input: s = "A man, a plan, a canal: Panama"
//    Output: true
//    Explanation: "amanaplanacanalpanama" is a palindrome.
//            Example 2:
//
//    Input: s = "race a car"
//    Output: false
//    Explanation: "raceacar" is not a palindrome.
//    Example 3:
//
//    Input: s = " "
//    Output: true


        public static boolean isPalindrome(String s) {


            String temp = s.replaceAll("[!@#\\$%^&*()\\-_\\=+\\[\\]{}\\|;:'\",.<>/\\?`]", "").replace(" ", "");

            StringBuilder sh = new StringBuilder(temp);

            sh.reverse();
            System.out.println(sh);
            if (sh.toString().equalsIgnoreCase(temp)) {
                return true;
            }
            return false;

        }
            public static void main(String[] args){

            System.out.println(isPalindrome(" hii : My, name is Gagan"));
    }
}
