import java.util.Scanner;
//Ques_17--->>> Find if a number is palindrome or not???

public class PalindromeOrNot {
    public static void main(String[] args) {

        int num, pelin, rev=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        num = sc.nextInt();
        pelin = num;

        while(num != 0){
            rev = num % 10 + rev * 10;
            num /= 10;
        }
        //checking
        if(rev == pelin){
            System.out.println("The number is Palindrome.");
        }else{
            System.out.println("The Number is Not-Palindrome.");
        }
    }
}