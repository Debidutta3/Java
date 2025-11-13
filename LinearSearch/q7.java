package LinearSearch;

public class q7 {
    
    public static void count(int arr[]){
        for(int i=0; i<arr.length; i++){
            int count=0,  num=arr[i];
            while(num!=0){
                count++;
                num=num/10;
            }
            if(count%2==0){
                System.out.println("Element " + arr[i] + " has an even number of digits.");
            } else {
                System.out.println("Element " + arr[i] + " has an odd number of digits.");
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {12, 345, 67, 8901, 23456};

        count(arr);
    }
}
