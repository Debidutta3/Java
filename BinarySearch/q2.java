package BinarySearch;

public class q2 {
    
    public static void decSearch(int arr[], int target){
        int start=0, end=arr.length-1;

        while(start <= end){
            int mid = start + (end-start)/2;
            if(target == arr[mid]){
                System.out.println("Element found at: "+ mid);
                return;
            }
            else if(target < arr[mid]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        System.out.println("Element not found");
    }

    public static void main(String[] args) {
        int arr[] = {10, 9, 8, 7, 6, 5, 4, 3, 2};
        int target = 2;
        decSearch(arr, target);
        target = 11;
        decSearch(arr, target);
    }
}
