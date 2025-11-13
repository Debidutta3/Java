package LeetCode;

import java.util.*;
public class twoSum {
    
    public static void sum(int arr[], int target){

        int newId[] = new int[2];
        boolean found = false;

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){

                if(arr[i]+arr[j]==target){

                    newId[0]=i;
                    newId[1]=j;

                    System.out.println(Arrays.toString(newId));
                    found=true;
                    break;
                }
            }
        }
        if(!found){
            System.out.println("Not found");
        }
    }

    public static void main(String[] args) {
        
        int arr[]= {2,7,11,15};
        int target=9;

        sum(arr, target);
    }
}
