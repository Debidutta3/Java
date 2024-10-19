package JAVA.Functions;

import java.util.Scanner;
public class q2 {

    //Write a function to print the sum of all odd numbers from 1 to n.

    public static int sum_odd(int n){

        //declaring a sum variable
        int sum = 0;

        //declaring the loop
        for(int i=1; i<=n; i++){
            if(i%2 != 0 ){
                sum = sum + i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Taking the input
        System.out.println("Enter the number n:");
        int n = sc.nextInt();
        
        //Checking if the number is less than 0 or not
        if(n <= 0){
            System.out.println("Please retry and enter a number from 1 to "+n);
        }

        else{
            //Calling the function and printing the result
            System.out.println("The total sum is: "+sum_odd(n));
        }
    }
    
}
