import java.util.Scanner;

public class AverageN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int N = sc.nextInt();
        int sum = 0;
        System.out.println("Enter the "+N+" elements respectively :");

        for(int i = 0; i < N; i++){
            int num = sc.nextInt();
            sum += num;
        }
        double average = (double)sum / N;
        System.out.println(average);
    }
}