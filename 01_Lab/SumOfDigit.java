import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int rem, sum = 0;
        System.out.println("Please enter the number: ");
        int num = in.nextInt();

        while (num > 0){
            rem = num % 10;
            sum += rem;
            num = num / 10;
        }
        System.out.println("sum is: "+sum);
    }
}
