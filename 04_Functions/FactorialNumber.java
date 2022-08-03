import java.util.Scanner;

//Ques_9->> Write a program to print the factorial of a number by defining a method named 'Factorial'.

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int num = sc.nextInt();

        System.out.println(Factorial(num));
    }

    static int Factorial(int num) {
        int factorial = 1;
        for (int i = num; i > 0; i--) {
            factorial*=i;
        }
        return factorial;
    }
}