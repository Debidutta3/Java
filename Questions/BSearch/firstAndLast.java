package Questions.BSearch;

public class firstAndLast {

    public void searchRange(int[] nums, int target){
        int[] ans={-1,-1};
        ans[0]=search(nums, target, true);
        ans[1]=search(nums, target, false);
        System.out.println("First and Last Position: " + ans[0] + ", " + ans[1]);
    }
    
    //function
    int search(int[] arr, int target, boolean firstIndex){

        int start=0, end=arr.length-1;
        int ans=-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(target==arr[mid]){
                ans=mid;
                if(firstIndex){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        
        return ans;
    }


    public static void main(String[] args) {
        firstAndLast obj = new firstAndLast();
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        obj.searchRange(nums, target);
    }
}
