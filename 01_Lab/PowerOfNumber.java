import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int result = 1;
        System.out.println("Please enter the number: ");
        int num = sc.nextInt();

        System.out.println("Please enter the power of number: ");
        int power = sc.nextInt();

        while (power!=0){
            result = result * num;
            power--;
        }
        System.out.println(result);
    }
}
