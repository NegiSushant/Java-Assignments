/*

                                         * * * * * * *
                                          * * * * * *
                                           * * * * *
                                            * * * *
                                             * * *
                                              * *
                                               *

 */

public class Pattern_XI {
    public static void main(String[] args) {
        int n = 10;
        for (int row = n; row >= 1; row--) {
            for (int space = n - row; space >= 1; space--) {
                System.out.print(" ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
