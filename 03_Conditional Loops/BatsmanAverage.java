import java.util.Scanner;

// Qus.9->>Calculate Batting Average
public class BatsmanAverage {
    public static void main(String[] args) {
        int run, inning, not_out, out;
        double average;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of Runs: ");
        run = input.nextInt();

        System.out.print("Enter number of matches Played: ");
        inning = input.nextInt();

        System.out.print("Enter number of not-out matches: ");
        not_out=input.nextInt();

        out = inning - not_out;

        average = run / not_out;

        System.out.println("Batting Average= "+average);
    }
}