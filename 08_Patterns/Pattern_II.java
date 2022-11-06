/*

                                     * * * * * * *
                                     * * * * * * *
                                     * * * * * * *
                                     * * * * * * *
                                     * * * * * * *
                                     * * * * * * *
                                     * * * * * * *

 */
import java.util.Scanner;

public class Pattern_II {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the number of row: ");
        int n = sc.nextInt();

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
