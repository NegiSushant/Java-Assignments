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
public class Pattern_V {
    public static void main(String[] args){
        int n = 6;
        for (int row = 0; row < (2 * n); row++) {
            int totalColInRow = row > n ? 2 * n - row : row;
            for (int col = 0; col < totalColInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
