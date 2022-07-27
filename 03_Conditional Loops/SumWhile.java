import java.util.Scanner;

//Q-> Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
public class SumWhile {
    public static void main(String[] args) {
        int sum = 0;
        int n;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number: ");

        do{
            n = sc.nextInt();
            System.out.println("Please enter number: ");
            sum = sum + n;
        }while(n!=0);
        System.out.println("Sum = "+sum);
    }
}