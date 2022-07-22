import java.util.Scanner;

// Q-> Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the Principal amount: ");
        int P = in.nextInt();
        System.out.println("please enter the time in year: ");
        int T = in.nextInt();
        System.out.println("please enter the rate of interest: ");
        int R = in.nextInt();

        int SI = (P * R * T)/ 100;

        if (P==0 || T == 0 || R == 0){
            SI = 0;
            System.out.println("S.I. = "+SI);
        }
        else{
            System.out.println("S.I. = "+SI);
        }
    }
}
