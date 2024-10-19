package JAVA.Functions;

import java.util.Scanner;

//find gcd

public class q7 {

    public static int findGcd(int a, int b){

        int gcd = 1;

        if(a==0){
            return b;
        }

        if(b==0){
            return a;
        }

        if(a != 0 && b != 0){
            for(int i=1; i<=a && i<=b; i++){
                if(a%i==0 && b%i==0){
                    gcd = i;
            }
        }
    }
    return gcd;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter two numbers");
    int a = sc.nextInt();
    int b = sc.nextInt();

    System.out.println(findGcd(a,b));
}
}