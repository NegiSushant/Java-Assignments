//Ques_26-->> Write a program to print the sum of negative numbers, sum of positive even numbers and the
// sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.

import java.util.Scanner;

public class SumOfOddPositiveNegative {
    public static void main(String[] args) {
        System.out.println("Please enter the numbers and 0 to stop: ");

        int num, nSum = 0, eSum = 0, oSum = 0;

        while (true) {
            Scanner in = new Scanner(System.in);
            num = in.nextInt();

            if (num < 0) {
                nSum += num;
            }
            else {
                if (num % 2 == 0) {
                    eSum += num;
                }else {
                    oSum += num;
                }
            }
            if (num == 0) {
                System.out.println("Negative Sum: " + nSum+".");
                System.out.println("Even sum: "+eSum+".");
                System.out.println("Odd Sum: "+oSum+".");
                break;
            }
        }
    }
}