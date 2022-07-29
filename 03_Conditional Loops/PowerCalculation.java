import java.util.Scanner;
//Ques->>> Power In Java?????

public class PowerCalculation {
    public static void main(String[] args) {
        double num, power;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        num = sc.nextDouble();

        System.out.println("Please enter the power of that number: ");
        power = sc.nextDouble();

        double total_power = Math.pow(num, power);
        System.out.println(num+" the power "+power+" is = "+total_power);

    }
}