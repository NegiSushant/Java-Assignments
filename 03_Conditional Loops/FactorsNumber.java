import java.util.Scanner;
//Q-> Input a number and print all the factors of that number (use loops).
public class FactorsNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number: ");

        int num = sc.nextInt();

        for(int i=1; i<=num; i++){
            if(num%i == 0){
                System.out.print(i+", ");
            }
        }
    }
}