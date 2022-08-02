import java.util.Scanner;
//Ques_4-->> Write a program to print the sum of two numbers entered by user by defining your own method.

public class SumOfTwo {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the 1st number: ");
        int num1 = in.nextInt();

        System.out.println("Please enter the 2nd number: ");
        int num2 = in.nextInt();

        int sum = SumIs(num1, num2);
        System.out.println("Sum of "+num1+" and "+num2+" is "+sum+".");
    }
    static int SumIs(int num1, int num2){
        return (num1+num2);
    }
}