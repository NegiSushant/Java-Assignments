import java.util.Scanner;

//Ques_2-->> Define a program to find out whether a given number is even or odd.

public class EvenOdd {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = in.nextInt();

        isEven(num);
    }
    static int isEven(int num){
        if (num % 2 == 0){
            System.out.println(num+" is Even number.");
        }else {
            System.out.println(num+" is Odd number.");
        }
        return num;
    }
}