package LinearSearch;

public class q4 {
    
    //max
    public static void max(int arr[]){
        int temp=arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>temp){
                temp=arr[i];
            }
        }
        System.out.println("Maximum element is: " + temp);
    }

    //min
    public static void min(int arr[]){
        int min=arr[0];
        for(int i=0;i<arr.length; i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Minimum element is: " + min);
    }

    public static void main(String[] args) {
        int arr[]={1, 2, 3, 4,0,6, 17,8, 9, 10};

        max(arr);
        min(arr);
    }
}
