package LinearSearch;
import java.util.*;
public class q1 {
    
    //function
    public static void LS(int arr[], int ele){
        for(int i=0 ;i<arr.length; i++){
            if(arr[i]==ele){
                System.out.println("Element found at index: " + i);
                return; // Exit after finding the element
            }
        }
        System.out.println("Element not found in the array.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;

        System.out.println("Enter the size of the array: ");
        size = sc.nextInt();

        int arr[]=new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Input array: "+Arrays.toString(arr));

        int ele;
        System.out.println("Enter the element to search: ");
        ele = sc.nextInt();

        LS(arr, ele);
    }
}
