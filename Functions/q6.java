package JAVA.Functions;

import java.util.Scanner;

public class q6 {
    // Two numbers are entered by the user, x and n. Write a function to find the
    // value of one number raised to the power of another i.e. x^n.

    public static double power(double x, double n){
        double ans = Math.pow(x, n);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number (base)");
        double x = sc.nextDouble();

        System.out.println("Enter the number (power)");
        double n = sc.nextDouble();

        System.out.println("The answer is: "+power(x, n));
    }

}
