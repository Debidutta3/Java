package LinearSearch;

public class q6 {
    
    public static void evenODD(int arr[]){
        int count = 0; // Initialize count of even numbersq
        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2 == 0){
                count++;
            }
        }
        System.out.println("Count of even numbers: " + count);
        System.out.println("Count of odd numbers: " + (arr.length - count));
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        evenODD(arr);
    }
}
