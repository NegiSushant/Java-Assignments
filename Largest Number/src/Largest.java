import java.util.Scanner;

// Q-> Take 2 numbers as input and print the largest number.
public class Largest {
    public static void main(String[] args) {
        float num1, num2, max;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first Num: ");
        num1 = sc.nextInt();

        System.out.println("Enter the second Num: ");
        num2 = sc.nextInt();

        max = num1;
        if(num2 > num1){
            max = num2;
            System.out.println("Largest number is: "+max+".");
        }else {
            System.out.println("Largest number is: "+max+".");
        }
    }
}