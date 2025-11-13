package BinarySearch;

public class q1 {
    
    public static void search(int arr[], int target){
        int start=0;
        int end=arr.length-1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                System.out.println("Element found at: " + mid);
                return;
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        System.out.println("Element not found");
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 5;
        search(arr, target);
        target = 11;
        search(arr, target);
    }
}
