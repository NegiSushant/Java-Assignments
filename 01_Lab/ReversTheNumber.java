import java.util.Scanner;

public class ReversTheNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num, rem, new_num = 0;

        System.out.println("Please enter the number: ");
        num = sc.nextInt();

        while(num != 0){
            rem = num % 10;
            new_num = new_num * 10 + rem;
            num = num / 10;

        }
        System.out.println(new_num);
    }
}
