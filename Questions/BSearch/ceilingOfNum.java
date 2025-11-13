package Questions.BSearch;

public class ceilingOfNum {
    
    public static void ceil(int arr[], int target){
        int start=0, end = arr.length-1;

        if(target > arr[end]){
            System.out.println("Ceiling is: " + -1);
            return;
        }
        
        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                System.out.println("Ceiling is: "+ arr[mid]);
                return;
            }
            else if(target < arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        System.out.println("Ceiling is at index: "+ start);
    }

    public static void floor(int arr[], int target){

        int start=0, end=arr.length-1;

        if(target < arr[start]){
            System.out.println("Floor is: " + -1);
            return;
        }

        while(start<=end){
            int mid= start + (end - start)/2;

            if(target==arr[mid]){
                System.out.println("Floor is: "+arr[mid]);
                return;
            }
            else if(target < arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        System.out.println("Floor is at the index: "+ end);
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 6, 8, 9, 10};
        int target = 7;
        ceil(arr, target);
        floor(arr, target);
        
        target = 11;
        ceil(arr, target);
        floor(arr, target);
        
    }
}
