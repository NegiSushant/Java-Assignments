import java.util.Scanner;

//Ques_6-> Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the radius of circle: ");
        int radius = sc.nextInt();

        double ans = circumference(radius);
        System.out.println("Circumference: "+ans);
        double a = area(radius);
        System.out.println("Area is: "+a);

    }
    static double  circumference(int radius){
        double circum = 2*Math.PI*radius*radius;
        return circum;
    }
    static double area(int radius){
        double area = Math.PI*radius*radius;
        return area;
    }
}