import java.util.Scanner;

public class LargestWhile {
    public static void main(String[] args) {
        int num;
        int max = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number: ");

        do {
            num = sc.nextInt();

            if(max < num){
                max = num;
            }
            System.out.println("Please enter the number: ");
        }while(num != 0);

        System.out.println("Largest number is: "+max);
    }
}