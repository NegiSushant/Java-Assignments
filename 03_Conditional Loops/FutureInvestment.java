import java.util.Scanner;

//Ques_18---> Future Investment Value

public class FutureInvestment {
    public static void main(String[] args) {
        double p, r, t;
        double Investment;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of principle: ");
        p = in.nextDouble();

        System.out.println("Enter the value of rate: ");
        r = in.nextDouble();

        System.out.println("Enter the value of time: ");
        t = in.nextDouble();

        // Calculate Future investment Value

        Investment = p * (Math.pow((1 + r / 100), t));

        System.out.println("Future Interest is "+ Investment);
    }
}