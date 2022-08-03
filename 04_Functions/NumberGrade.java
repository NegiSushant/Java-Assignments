import java.util.Scanner;

//Ques_8->> Write a program that will ask the user to enter his/her marks (out of 100).
// Define a method that will display grades according to the marks entered as below:

public class NumberGrade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the subject number: ");
        int num = in.nextInt();

        System.out.println(GradSystem(num));
    }

    static String GradSystem(int num) {
        if (num >=101){
            return "Invalid Number!";
        }else {
            if (num>= 91 && num <= 100){
                return "AA";
            }else if (num >= 81 && num <= 90) {
                return "AB";
            } else if (num >= 71 && num <= 80) {
                return "BB";
            }else if (num>=61 && num<=70){
                return "BC";
            }else if (num>=51 && num<=60){
                return "CD";
            }else if (num>=41 && num<=50){
                return "DD";
            }else{
                return "FAIL";
            }
        }
    }
}