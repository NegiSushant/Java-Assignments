/*
                                      *
                                     * *
                                    * * *
                                   * * * *
                                  * * * * *
                                 * * * * * *
                                  * * * * *
                                   * * * *
                                    * * *
                                     * *
                                      *

 */
public class Pattern_XXVII {
    public static void main(String[] args) {
        int n = 6;
        for (int row = 0; row < (2 * n); row++) {
            int totalColInRow = row > n ? 2 * n - row : row;

            int NUmSpaces = n - totalColInRow;
            for (int space = 0; space < NUmSpaces; space++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalColInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
