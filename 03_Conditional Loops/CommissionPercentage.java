import java.util.Scanner;

public class CommissionPercentage {
    public static void main(String[] args) {
        double amount, commission;
        Scanner sc=new Scanner(System.in);

        System.out.println("Please enter the amount: ");
        amount=sc.nextDouble();

        System.out.println("Please enter a commission Percentage: ");
        commission=sc.nextDouble();

        double total_commission =(commission/100)*amount;

        System.out.println("Commission amount="+total_commission);
    }
}