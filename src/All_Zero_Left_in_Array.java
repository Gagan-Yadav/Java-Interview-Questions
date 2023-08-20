import java.sql.SQLOutput;
import java.util.*;

public class All_Zero_Left_in_Array {

   static void Zeroleft(int[] arr){

       int n = arr.length,count=0,zcount=0;
       int[] arr2 = new int[n];
       for (int i = 0; i <arr.length ; i++) {
           if(arr[i]==0){
               zcount++;
           }
       }
       for (int i = 0; i < arr.length; i++) {
               if (arr[i] == 0) {
                   arr2[count] = arr[i];
                   count++;
               } else {
                   arr2[zcount]=arr[i];
                    zcount++;
               }
       }
       System.out.print("\nNew Array - ");

       for (int i = 0; i < arr2.length; i++) {
           System.out.print(arr2[i]+" ");
       }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of an Array - ");
        int size = sc.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter Array Elements - ");

        for (int i = 0; i <size ; i++) {
            arr[i]=sc.nextInt();
        }

        System.out.print("Original Array - ");

        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        Zeroleft(arr);

    }
}
