import java.util.Scanner;

public class VotingAge {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the age: ");
        int age = sc.nextInt();

        isEligible(age);
    }
    static int isEligible(int age){
        if(age >= 18){
            System.out.println("The person of age "+age+ " is eligible for voting.");
        }else{
            System.out.println("The person of age "+age+ " is not eligible for voting.");
        }
        return age;
    }
}