import java.util.Scanner;

//Ques_24-->>> Sum Of A Digits Of Number.

public class DigitSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int num = in.nextInt();

        int sum = 0;

        int lenght =  (int)(Math.log10(num)+1);

        for (int i = 0; i<lenght; i++){
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println(sum);
    }
}