package Questions.Sorting;

public class findMissingElement {
    
    public static void find(int arr[]){

        int i=0;
        
        while(i<arr.length){

            int value=arr[i];

            if(value<arr.length && arr[i]!=arr[value]){
                swap(arr, i,value);
            }
            else{
                i++;
            }
        }

        for(int j=0; j<arr.length; j++){
            if(arr[j]!=j){
                System.out.println(j);
                return;
            }
        }
        System.out.println(arr.length);
    }

    public static void swap(int arr[], int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

    public static void main(String[] args) {
        int arr[]={4,0,1,2};
        find(arr);
    }
}
