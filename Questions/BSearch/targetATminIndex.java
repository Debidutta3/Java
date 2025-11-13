package Questions.BSearch;

public class targetATminIndex {
    

    //function


    public static int search(int arr[], int target){
        
        int peak=findPeak(arr);

        //search in ascending
        int firsttry=OABS(arr, target,0,peak);
        if(firsttry != -1){
            return firsttry;
        }
        //try searching in descending
        return OABS(arr, target, peak+1, arr.length-1);
    }


    public static int findPeak(int arr[]){
        int start=0, end=arr.length-1;

        while(start<end){
            int mid=start+(end-start)/2;

            if(arr[mid]>arr[mid+1]){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }

    public static int OABS(int arr[], int target, int start, int end){ //we have no fixed start or end
        
        //ascending
        if(arr[start]<arr[end]){
            
            while(start<=end){

                int mid=start+(end-start)/2;

                if(arr[mid]==target){
                    return mid;
                }
                else if(target<arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        else{

            while(start<=end){

                int mid=start+(end-start)/2;

                if(arr[mid]==target){
                    return mid;
                }
                else if(target>arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
       int arr[]={1,2,3,4,5,6,7,8,9,8,7,6,5};

       int target=8;

       System.out.println(search(arr, target));

    }

}
