package JAVA.Functions;

import java.util.*;
public class q3 {

    //Write a function which takes in 2 numbers and returns the greater of those two.
    public static int greater_number(int a, int b) {

        //Using math.max method to print the maximum number
        int max = Math.max(a, b);
        return max;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(greater_number(a, b));
    }
}
