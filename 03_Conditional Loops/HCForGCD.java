//Ques_19->>> HCF Of Two Numbers Program.

import java.util.Scanner;

public class HCForGCD {
    public static void main(String[] args) {
        int num1, num2;

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the num1: ");
        num1 = sc.nextInt();

        System.out.print("Please enter the num2: ");
        num2 = sc.nextInt();

        while(num1 !=  num2){

            if(num1 > num2){
                num1 = num1 - num2;
            }
            else{
                num2 = num2 - num1;
            }
        }
        System.out.println("HCF is: "+num1);

//        int max= Math.max(num1, num2);
//
//
//        for (int i = max; i >=1; i--)
//        {
//            if (num1 % i == 0 && num2 % i == 0)
//            {
//                System.out.println("HCF is " + i);
//            }
//        }
    }
}