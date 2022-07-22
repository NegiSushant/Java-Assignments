// Q-> Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)!!

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Float ans;
        System.out.print("Enter the operator: ");
        char op = in.next().trim().charAt(0);
        System.out.println("Enter the first number: ");
        Float a = in.nextFloat();
        System.out.println("Enter the Second number: ");
        Float b = in.nextFloat();

        if (op == '+') {
            ans = a + b;
            System.out.println("Sum is: "+ans+".");
        }
        if (op == '-') {
            ans = a - b;
            System.out.println("Difference is: "+ans+".");
        }
        if (op == '*') {
            ans = a * b;
            System.out.println("Multiplication is: "+ans+".");
        }
        if (op == '/') {
            if (b == 0) {
                System.out.println("Invalid Number!");
            }else{
                ans = a / b;
                System.out.println("Quotient is: "+ans+".");
            }
        }
    }
}