import java.util.Scanner;

//Q- Write a program to print whether a number is even or odd, also take input from the user.
public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the Number: ");
        int num = input.nextInt();

        if (num / 2 == 0 ){
            System.out.println("The "+num+" is EVEN.");
        }
        else{
            System.out.println("The "+num+" is ODD.");
        }
    }
}
