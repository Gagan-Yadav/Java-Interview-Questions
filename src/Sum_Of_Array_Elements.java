import java.util.*;
public class Sum_Of_Array_Elements {

    static int sum(int[] arr){
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum+arr[i];
        }

        return sum;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an Array - ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter Array Elements - ");
        for (int i = 0; i < size; i++) {
            arr[i]= sc.nextInt();

        }
        System.out.print("Array - ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");

        }

        System.out.println("\nSum of Array Elements - "+sum(arr));


    }
}
