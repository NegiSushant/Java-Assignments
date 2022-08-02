import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("PLease enter the number: ");
        int num = sc.nextInt();

        ;
        System.out.println(isPrime(num));
    }

    static boolean isPrime(int num) {
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0){
                return false;
                //System.out.println(num+ " is not prime number.");
            }

        }
        return true;
    }
}