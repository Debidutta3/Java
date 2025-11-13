package Questions.Sorting;

import java.util.*;
public class missingele {
    

    public static void swap(int arr[], int first, int second){

        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

    public static void cycle(int arr[]){

        int i=0;

        while(i<arr.length){

            int value = arr[i]-1;

            if(value<arr.length && arr[i] != arr[value]){
                swap(arr, i, value);
            }
            else{
                i++;
            }
        }

        ArrayList <Integer> list = new ArrayList<>();

        for(int j=0; j<arr.length; j++){
            if(arr[j] != j+1){
                list.add(j);
            }
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        int arr[] = {4,7,8,1,5,6,9};
        cycle(arr);
    }
}
