import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int num = ss.nextInt();
        int fact = 1;

        for (int i =1; i<num; i++){
            fact = fact * i;
        }
        System.out.println("Factorial of " + num + " is " + fact);

    }
}