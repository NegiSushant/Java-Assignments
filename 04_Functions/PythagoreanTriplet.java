//Ques_12-->>> Write a function to check if a given triplet is a Pythagorean triplet or not.

import java.util.Scanner;

// (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).
public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Please enter the length of triangle: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        System.out.println(isTripletorNot(a, b, c));
    }

    static boolean isTripletorNot(int a, int b, int c) {
        if (a<b && b < c){
            if(a*a + b*b == c*c){
                return true;
            }
        } else if (a<c && c<b){
            if(a*a + c*c == b*b){
                return true;
            }
        }
        else{
            if (b*b + c*c == a*a){
                return true;
            }
        }
        return false;
    }
}