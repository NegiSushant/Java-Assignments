import java.util.Scanner;

public class FabSeries {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms in the fibbonaci series: ");
        int feb = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.print(a + " " +b);
        for(int i = 0; i < feb; i++){
            int temp = a+b;
            System.out.print(" " + temp);
            a = b;
            b = temp;
        }
        sc.close();
    }
}
