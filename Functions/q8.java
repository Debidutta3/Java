package JAVA.Functions;

import java.util.*;

public class q8 {
    // print n fibonacci series

    public static void fibonacci(int n) {

        int num1 = 0, num2 = 1;
        for (int i = 0; i < n; i++) {
            if (n == 0) {
                System.out.println(0);
            } else if (n == 1) {
                System.out.println(1);
            } else {
                int sum = num1 + num2;
                num1 = num2;
                num2 = sum;
                System.out.print(sum+ " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter upto which u want to print the fibonacci series");
        int n = sc.nextInt();

        fibonacci(n);
    }
}
