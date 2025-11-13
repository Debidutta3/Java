package Arrays;
import java.util.*;
public class reverse {

    public static void reversed(int arr[]){
        int start=0, end=arr.length-1;

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        System.out.println("Reversed array: " + Arrays.toString(arr));
    }
    
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arr2[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int arr3[] = {1, 2, 3, 4, 5};

        reversed(arr1);
        reversed(arr2);
        reversed(arr3);
    }   
}
