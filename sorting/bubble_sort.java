package sorting;

import java.util.Arrays;

public class bubble_sort {
    
    public static void bubble(int arr[]){

        for(int i=0; i<arr.length; i++){
            for(int j=1; j<arr.length-i; j++){
                if(arr[j]<arr[j-1]){
                    swap(arr, j, j-1);
                }
            }
        }
    }
    public static void swap(int arr[], int start, int second){
        int temp=arr[start];
        arr[start]=arr[second];
        arr[second]=temp;
    }

    public static void main(String[] args) {
        int arr[]={5, 4, 3, 2, 1,10};
        bubble(arr);
        System.out.println("Sorted array: "+Arrays.toString(arr));
    }
}
