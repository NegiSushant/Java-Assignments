//Ques_5->> Define a method that returns the product of two numbers entered by user.

import java.util.Scanner;

public class ProductOfTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the 1st number: ");
        int num1 = in.nextInt();

        System.out.println("Please enter the 2nd number: ");
        int num2 = in.nextInt();

        int Product = ProductIs(num1, num2);
        System.out.println("Product of "+num1+" and "+num2+" is "+Product+".");
    }
    static int ProductIs(int num1, int num2){
        return (num1*num2);
    }
}