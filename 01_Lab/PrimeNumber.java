import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the number: ");
        int num = sc.nextInt();

        int flag = 0;

        for (int i = 2; i < Math.sqrt(num); i++) {
            if(num % i == 0){
                flag = 1;
                break;
            }
        }
        if(flag == 1){
            System.out.println(num+" is Not Prime number.");
        }else {
            System.out.println(num+ " is a prime number.");
        }
    }
}