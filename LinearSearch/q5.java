package LinearSearch;

public class q5 {
    

    public static void search(int arr[][], int target){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j]==target){
                    System.out.println("Element found at index: (" + i + ", " + j + ")");
                    return; // Exit after finding the element
                }
            }
        }
        System.out.println("Element not found in the 2D array.");
    }
    public static void main(String[] args) {
        int arr[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int target1 = 5;

        search(arr, target1);
        int target2 = 10;
        search(arr, target2);
    }
}
