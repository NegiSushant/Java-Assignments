/*

                                 * * * * * * *
                                 * * * * * *
                                 * * * * *
                                 * * * *
                                 * * *
                                 * *
                                 *

 */

import java.util.Scanner;

public class Pattern_III {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the number of row: ");
        int n = sc.nextInt();
//        int n = 7;

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= (n - row + 1); col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
