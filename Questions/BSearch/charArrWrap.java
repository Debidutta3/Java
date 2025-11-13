package Questions.BSearch;

public class charArrWrap {
    
    public static void wrap(char[] arr, char target){

        int start=0, end=arr.length-1;

        while(start<=end){

            int mid=start+(end-start)/2;

            if(target<arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        System.out.println(start % arr.length);
    }

    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'c', 'd', 'e'};
        char target = 'e';
        wrap(arr, target);
    }
}
