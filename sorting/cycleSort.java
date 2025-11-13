package sorting;

import java.util.*;
public class cycleSort {
    
    public static void cycle(int arr[]){
        
        int i=0;
        
        while(i<arr.length){
            int value=arr[i]-1;

            if(value<arr.length && arr[i] != arr[value]){
                swap(arr, i, value);
            }
            else{
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int arr[], int first, int second){

        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

    public static void main(String[] args) {
        int arr[]={3,5,2,1,4};
        cycle(arr);
    }
}
