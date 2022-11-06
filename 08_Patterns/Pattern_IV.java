/*
                                                1
                                                1 2
                                                1 2 3
                                                1 2 3 4
                                                1 2 3 4 5
                                                1 2 3 4 5 6
                                                1 2 3 4 5 6 7

 */
import java.util.Scanner;

public class Pattern_IV {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the number of row: ");
        int n = sc.nextInt();
//        int n = 7;

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
