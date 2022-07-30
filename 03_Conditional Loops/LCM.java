import java.util.Scanner;

//Ques_20--->>>>> LCM Of Two Numbers


public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please entre the 1st number: ");
        int num1 = sc.nextInt();

        System.out.println("Please entre the 2nd number: ");
        int num2 = sc.nextInt();
        int max = Math.max(num1, num2);
        int lcm;

        if (num1==1 || num2==1){
            System.out.println("LCM is " + 1);
        }
        else{
            while(true){
                if(max % num1 == 0 && max % num2 == 0){
                    lcm = max;
                    break;
                }
                ++max;
            }
            System.out.println("LCM is: "+lcm);
            return;
        }
    }
}