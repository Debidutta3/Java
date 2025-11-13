package LeetCode;

import java.util.*;
public class top_k_frequent_element {
    
    public static void top(int arr[], int k){

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();

        int count=1;
        for(int i=1; i<arr.length; i++){
            if(arr[i] == arr[i-1]){
                count++;
            }
            else{
                list.add(count);
                list1.add(arr[i-1]);
                count=1;
            }
        }

        Collections.sort(list, Collections.reverseOrder());

        System.out.println("Top " + k + " elements are: ");
        for(int i=0; i<k; i++){
            //System.out.print(list.get(i) + " ");
            //System.out.println();
            System.out.print(list1.get(i) + " ");
        }
    }

       /*  ArrayList<Integer> list2 = new ArrayList<>();
        for(int i=0; i<list.size(); i++){
            int temp=1;
            
            for(int j=i+1; j<list.size()-1; j++){
                if(list.get(i) == list.get(j)){
                    temp++;
                    list2.add(temp);
                }
                else{
                    continue;
                }
            }
        }

        Collections.sort(list2);

        for(int i=0; i<k; i++){
            System.out.println(list2);
        }
    }*/


    public static void main(String[] args) {
        
        int arr[]={1,1,1,1,2,2,2,3,3,4};
        int k=2;

        top(arr, k);
    }
}
