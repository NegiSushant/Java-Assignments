import java.util.Scanner;

//Ques_22--->>>>> Perfect Number In Java

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, fact;

        System.out.println("Please enter the number: ");
        num = sc.nextInt();

        fact = 0;

        for(int i = 1; i < num; i++){
            if(num % i == 0){
                fact += i;
            }
        }
        if (fact == num){
            System.out.println(num+" is a Perfect Number.");
        }
        else {
            System.out.println(num+" is Not a Perfect Number.");
        }
    }
}