package LeetCode;

import java.util.ArrayList;

public class unordered_twoSum {
    
    
    public static void sort(int arr[]){

        for(int i=0; i<arr.length; i++){
            for(int j=1; j<arr.length; j++){

                if(arr[j]<arr[j-1]){
                    swap(arr, j,j-1);
                }
            }
        }
    }
    public static void swap(int arr[], int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

    public static void twoSum(int arr[], int target){

        sort(arr);

        boolean found = false;
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){

                if(arr[i] + arr[j] == target){
                    list.add(arr[i] + " + " + arr[j]);
                    found=true;
                }
            }
        }
        if(found==false){
            System.out.println("Not found");
        }
        else{
            System.out.println("Found at indices: " + list);
        }
    }

    public static void main(String[] args) {
        
        int arr[] = {3, 2, 4, 1, 5};
        int target = 6;

        twoSum(arr, target);

        int arr1[] = {3, 2, 4, 7, 11, 15};
        int target1 = 9;

        twoSum(arr1, target1);
    }

}
