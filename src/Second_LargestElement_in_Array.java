import java.util.*;
public class Second_LargestElement_in_Array {

   public static int findSecondLArgest(int[] arr){
       int max=0,smax=0;
       for (int i = 0; i < arr.length; i++) {
           if(max<arr[i]){
               max= arr[i];
           }else{
               if(smax<max && smax < arr[i]){
                   smax=arr[i];
               }
           }
       }
        return smax;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of an Array - ");
        int size = sc.nextInt();
        int[] arr  = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i]=sc.nextInt();
        }

        System.out.println("Second Max = "+findSecondLArgest(arr));
    }
}
