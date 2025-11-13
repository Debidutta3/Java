package Arrays;

public class maxElement {

    //fucntion

    public static int max(int arr[]){
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arr2[] = {10, 9, 8, 7, 6, 52, 4, 3, 2, 1};

        System.out.println("Max element in arr1: " + max(arr1));
        System.out.println("Max element in arr2: " + max(arr2));
    }
}
