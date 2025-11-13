package Questions.Sorting;

import java.util.ArrayList;

public class findAllMissingElement {
    
    public static void findall(int arr[]){

        int i=0;

        while(i<arr.length){
            
            int value=arr[i]-1;

            if(value<arr.length && arr[i]!=arr[value]){
                swap(arr, i, value);
            }
            else{
                i++;
            }
        }

        ArrayList<Integer> list=new ArrayList<>();
        for(int j=0; j<arr.length; j++){
            if(arr[j] != j+1){
                list.add(j+1);
            }
        }
        System.out.println(list);
    }

    public static void swap(int arr[], int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

    public static void main(String[] args) {
        
        int arr[]={5,1,3,8,5,4,9};
        findall(arr);
    }
}
