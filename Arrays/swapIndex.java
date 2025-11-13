package Arrays;

import java.util.*;

public class swapIndex{


    //function swap

    public static void swap(int id1, int id2, int[] arr){
        int temp=arr[id1];
        arr[id1]=arr[id2];
        arr[id2]=temp;

        System.out.println("New array: "+Arrays.toString(arr));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int id1, id2, size;

        System.out.println("Enter the size of the array:");
        size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the elements of the array");

        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Original array: "+Arrays.toString(arr));

        System.out.println("Enter the first index to swap:");
        id1 = sc.nextInt();
        System.out.println("Enter the second index to swap:");
        id2 = sc.nextInt();


        swap(id1, id2, arr);
    }
}