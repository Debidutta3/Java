package Questions.BSearch;

public class InfiniteArrayElement{


    //what this function does is that it searches whether the target element is present in the array of the given size or not
    public static int search(int arr[], int target){
        //start with an array of size 2

        int start=0, end=1;

        //condition for the target to lie between the range
        while(target>arr[end]){
            int temp=end+1;

            //end of the new array is this formula and *2 is to double the size of the array 
            end=end+(end-start+1)*2;

            //update the start value
            start=temp;
        }
        //once the element is found in the array then call the binary search function to find the target element in the array
        return BS(arr,target,start,end);
    }


    public static int BS(int arr[], int target, int start, int end){
        //here start and end is to be passed

        while(start<=end){
            int mid=start+(end-start)/2;

            if(target==arr[mid]){
                return mid;
            }
            else if(target < arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
    

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
        int target=15;
        System.out.println(target+" is at index: "+search(arr, target));
    }
}
