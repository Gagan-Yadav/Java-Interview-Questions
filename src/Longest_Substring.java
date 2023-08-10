public class Longest_Substring {

    public static void main(String[] args){
//        System.out.println("gagan");

        String[] str = {"gagan","sankalp","Dhruv","Rohan"};
        int count=0;int max=0;
        String temp = str[0];
//        for (int i = 0; i < str.length; i++) {
//            String temp = str[i];
        String str2=temp;
            System.out.println(temp.length());
            for (int j = 0; j < temp.length(); j++) {
                    if (j==0) {
                                count++;
                    }

            }
            if(count>max){
                max = count;
                count = 0;
            }
//        }
        System.out.println("Max = "+max);
    }
}
