package Questions.Sorting;

public class findDulicates {
    
    public static void finddup(int arr[]){

        int i=0;

        while(i<arr.length){

            int value=arr[i]-1;

            if(value<arr.length && arr[i]!=arr[value]){
                swap(arr, i,value);
            }
            else{
                i++;
            }
        }
        for(int j=1; j<arr.length-1; j++){
            if(arr[j]==arr[j-1]){
                System.out.println(j);
                return;
            }
        }
        System.out.println(-1);
    }

    public static void swap(int arr[], int f, int s){
        int temp=arr[f];
        arr[f]=arr[s];
        arr[s]=temp;
    }


    public static void main(String[] args) {
        int arr[]={5,5,1,2,9,7};
        finddup(arr);
    }
}
