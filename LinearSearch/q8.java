package LinearSearch;

public class q8 {
    
    public static void rich(int arr[][]){
        int ans=0;
        for(int i=0; i<arr.length; i++){
            int sum=0;
            for(int j=0; j<arr[i].length; j++){
                sum += arr[i][j];
            }
            if(sum > ans){
                ans = sum;
            }
        }
        System.out.println("Maximum wealth is: " + ans);
    }
    public static void main(String[] args) {
        int arr[][] = {
            {3, 2, 3},
            {4, 4, 6},
            {7, 1, 9}
        };
        rich(arr);
    }
}
