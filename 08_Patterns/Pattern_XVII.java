/*

                                  1
                                2 1 2
                              3 2 1 2 3
                            4 3 2 1 2 3 4
                          5 4 3 2 1 2 3 4 5
                        6 5 4 3 2 1 2 3 4 5 6
                          5 4 3 2 1 2 3 4 5
                            4 3 2 1 2 3 4
                              3 2 1 2 3
                                2 1 2
                                  1


 */

public class Pattern_XVII {
    public static void main(String[] args) {
        int n = 6;
        for (int row = 1; row <=(2 * n); row++) {
            int c = row > n ? 2 * n - row : row;

            for (int space = 0; space < n - c; space++) {
                System.out.print("  ");
            }
            for (int col = c; col >= 1; col--) {
                System.out.print(col+" ");
            }
            for (int col = 2; col <= c; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
