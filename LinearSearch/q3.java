package LinearSearch;
import java.util.*;

public class q3 {
    
    //function
    public static void searchElement(int arr[], int target, int r1, int r2){
        for(int i=r1; i<=r2; i++){
            if(target == arr[i]){
                System.out.println("Element '" + target + "' found at index: " + i);
                return; // Exit after finding the element
            }
        }
        System.out.println("Element '" + target + "' not found in the specified range.");
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 5;

        int start1=1;
        int end1=5;

        int start2=5;
        int end2=9;

        System.out.println("Searching in range [" + start1 + ", " + end1 + "]");
        searchElement(arr, target, start1, end1);
        System.out.println("Searching in range [" + start2 + ", " + end2 + "]");
        searchElement(arr, target, start2, end2);
    }
}
