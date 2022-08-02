import java.util.Scanner;
//Qs_1->> Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
public class MaximumMinimumNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the three number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("Maximum of the number is: "+max(a, b, c));
        System.out.println("Minimum of the number is: "+min(a, b, c));

    }
    static int max(int a, int b, int c){
        int max = a;
        if(b > max){
            max = b;
        }
        //System.out.println(b+" is the maximum number.");

        if(c > max){
            max = c;
        }
        return max;
    }

    static int min(int a, int b, int c){
        int min = a;
        if( b < min){
            min = b;
        }
        //System.out.println(b+" is the minimum number.");
        if( c < min){
            min = c;
        }
        return min;
    }

}