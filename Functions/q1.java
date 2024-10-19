package JAVA.Functions;

import java.util.Scanner;

public class q1 {
    // declaring function
    public static double average(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Enter the numbers whose average should be found
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        System.out.println("Enter the third number");
        int c = sc.nextInt();

        double avg = average(a, b, c);
        System.out.println("The average is: " + avg);
    }
}