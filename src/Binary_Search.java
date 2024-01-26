

s

    






import java.util.*;
public class Binary_Search {

    public static int[]  get(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array - ");
        int n = sc.nextInt();

        int [] arr = new int[n];

        System.out.println("Enter Array Elements - ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static boolean BinarySearch(int[] arr,int target){

        Arrays.sort(arr);

        int mid = arr.length/2;
        int low = 0;
        int high = arr.length-1;

        while (low <= high){

            if(arr[mid]<target){

                low = mid+1;

            } else if (arr[mid] == target) {

                System.out.println("Element "+arr[mid]+" is Present at "+mid+" Index");
                return true;

            }else {

                high = mid-1;

            }

            mid = (low+high)/2;
        }

        if ( low > high){

            System.out.println("Element "+target+" is not present in this array");
            return false;

        }

        return false;
    }
    public static void main(String[] args) {

        int[] arr = get();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Element to be Search in Array - ");
        int n = sc.nextInt();

        BinarySearch(arr,n);

//        if(BinarySearch(arr,n)){
//            System.out.println("Element Found");
//        }else {
//            System.out.println("Element Not Found");
//        }

    }
}
