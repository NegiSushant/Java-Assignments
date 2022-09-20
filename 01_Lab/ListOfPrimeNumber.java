import java.util.Scanner;

public class ListOfPrimeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n, num, flag, count = 0;

        System.out.println("How many prime number you want: ");
        n = sc.nextInt();

        for (num = 2; count <= n; num++) {
            flag = 0;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if(num % i == 0){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                System.out.println(num);
                count++;
            }
        }
    }
}
