import java.util.Scanner;
//Ques.11->>>> Compound Interest Java Program...

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float p, r, t, n; //Declare variables

        System.out.print("Enter the Principal: ");
        p = sc.nextFloat();

        System.out.print("Enter the Rate of interest: ");
        r = sc.nextFloat();

        System.out.print("Enter the Time period: ");
        t = sc.nextFloat();

        System.out.print("Enter the number of times that interest is compounded per unit t: ");
        n=sc.nextFloat();

        //Calculate the compound interest
        double amount = p * Math.pow(1 + (r / n), n * t);
        double Compound = amount - p;
        System.out.println("Compound Interest after " + t + " years: "+ Compound);
        System.out.println("Amount after " + t + " years: "+amount);
    }
}