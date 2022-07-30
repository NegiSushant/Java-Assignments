import java.util.Scanner;

//Ques_16-->>>> Reverse A String In Java....


public class ReverseString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Reverse of a string "+str+" is: ");

        int i = str.length();
        while(i>0){
            System.out.print(str.charAt(i-1));
            i--;
        }

    }
}