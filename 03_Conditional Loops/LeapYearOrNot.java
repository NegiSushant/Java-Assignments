import java.util.Scanner;

//Ques_23--->>>>>> Check Leap Year Or Not!!!!

public class LeapYearOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the Year: ");
        int y = sc.nextInt();

        if (y % 4 == 0){
            if (y % 100 == 0){
                if (y % 400 == 0){
                    System.out.println(y+" is leap year.");
                }else {
                    System.out.println(y+" is not leap year.");
                }
            }else {
                System.out.println(y+" is not leap year.");
            }
        }else {
            System.out.println(y+" is not leap year.");
        }
    }
}