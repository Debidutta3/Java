package JAVA.Functions;

import java.util.*;

public class q5 {
    // Write a function that takes in age as input and returns if that person is
    // eligible to vote or not. A person of age > 18 is eligible to vote.

    public static void eligible_for_vote(int age){
        //Valid age check
        if(age <= 0){
            System.out.println("Invalid age");
        }
        else if(age>18){
            System.out.println("You are eligible for voting");
        }
        else{
            System.out.println("You are not eligible for voting");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = sc.nextInt();

        eligible_for_vote(age);
    }
}
