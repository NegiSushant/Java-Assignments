//Ques_13-->> Write a function that returns all prime numbers between two given numbers.

import java.util.Arrays;
import java.util.Scanner;

public class PrimeBlwTwoNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // input for asking numbers.
        System.out.println("Please enter the first number: ");
        int first = in.nextInt();

        System.out.println("Please enter the second number: ");
        int second = in.nextInt();
        

        int[] Prime = isPrimeOrNot(first, second);
        for(int i = 0; i < Prime.length; i++){
            if(Prime[i] != 0)
            { // skipping the zeros at the end of the array
                //System.out.println("Prime number blw "+first+" "+second+ " is: "+Arrays.toString(Prime));
                System.out.print(Prime[i]+", ");
            }
        }

    }

    static int[] isPrimeOrNot(int first, int second) {
        int[] Prime = new int[second - first+1];// +1 include second number also.
        int num = first;
        int index = 0;
        while(num <= second){
            boolean isPrime = true;
            for(int i = 2; i <= Math.sqrt(num); i++){
                if(num % i == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                Prime[index] = num;
                index++;
            }
            num++;
        }
        return Prime;
    }
}