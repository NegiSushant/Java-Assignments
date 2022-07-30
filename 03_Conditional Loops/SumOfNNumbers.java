import java.util.Scanner;

public class SumOfNNumbers {
    public static void main(String[] args) {
        double num, sum;
        sum=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the numbers: ");
        num = sc.nextDouble();

        while (num!=0){
            sum += num;
            num = sc.nextDouble();
        }
        System.out.println("The sum: "+sum);
    }
}