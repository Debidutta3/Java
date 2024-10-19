package JAVA.Functions;

import java.util.Scanner;
public class q4 {

    //Write a function that takes in the radius as input and returns the circumference of a circle.

    public static double circumference(double radius){
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.println("Enter the radius of the circle");
        double radius = sc.nextDouble();

        System.out.println("The circumference is: "+circumference(radius));
    }
}
