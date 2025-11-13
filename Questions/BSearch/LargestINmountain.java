package Questions.BSearch;

public class LargestINmountain {

    public static int find(int arr[]){
        int start=0;
        int end=arr.length-1;

        while(start<end){

            int mid=start+(end-start)/2;

            if(arr[mid]>arr[mid+1]){

                //we are in the desc part of the array
                end=mid; //here we arent using end=mid-1 because mid may be the answer

            }
            else{

                //we are in the asce part of the array
                start=mid+1; // beacause mid+1 element is > than mid so we ignore the mid element
            }
        }

        //in the end start will be equal to end and will be pointing to the largest number
        return start;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,8,7,6,5};

        System.out.println(find(arr));
    }
    
}
