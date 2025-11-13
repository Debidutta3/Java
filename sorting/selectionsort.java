package sorting;
import java.util.Arrays;
public class selectionsort {
    
    public static void swap(int arr[], int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

    public static int maxIndex(int arr[], int first, int last){

        int max=first;
        for(int i=first; i<=last; i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }

    public static void selection(int arr[]){
        
        for(int i=0; i<arr.length; i++){
            int last=arr.length-i-1;
            int max=maxIndex(arr, 0, last);
            swap(arr, max, last);
        }
    }

    public static void main(String[] args) {
        
        int arr[]={5, 4, 3, 2, 1};
        selection(arr);
        System.out.println("Sorted array: "+Arrays.toString(arr));
    }
}
