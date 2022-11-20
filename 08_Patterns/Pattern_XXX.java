/*

                              1
                            2 1 2
                          3 2 1 2 3
                        4 3 2 1 2 3 4
                      5 4 3 2 1 2 3 4 5
                    6 5 4 3 2 1 2 3 4 5 6

 */

public class Pattern_XXX {
    public static void main(String[] args) {
        int n = 6;
        for (int row = 1; row <= n; row++) {
            for (int space = 0; space < n - row; space++) {
                System.out.print("  ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col+" ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col+" ");
            }

            System.out.println();
        }
    }
}
