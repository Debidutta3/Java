package BinarySearch;

public class q3 {
    
    public static void OABS(int arr[], int target){
        int start=0, end=arr.length-1;

        if(arr[start] < arr[end]){
            while(start <= end){
                int mid = start+(end-start)/2;

                if(target==arr[mid]){
                    System.out.println("Element found at: "+ mid);
                    return;
                }
                else if(target < arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        else{
            while(start <= end){
                int mid = start+(end-start)/2;

                if(target==arr[mid]){
                    System.out.println(("Element found at: "+ mid));
                    return;
                }
                else if(target < arr[mid]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
        System.out.println("Element not found");
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int target = 4;
        OABS(arr, target);
        int arr2[] = {6, 5, 4, 3, 2, 1};
        target = 2;
        OABS(arr2, target);
    }
}
