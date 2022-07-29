import java.util.Scanner;

public class CalculateCGPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double marks, Tmarks;
        double percentage, CGPA;

        System.out.println("Please enter the total marks you obtained: ");
        marks = sc.nextInt();

        System.out.println("Enter the total number of marks: ");
        Tmarks = sc.nextInt();

        percentage = (marks / Tmarks) * 100;

        CGPA = (double) Math.round(percentage / 9.5);

        System.out.println("Your CGPA is "+ CGPA);
    }
}
//(double) Math.round(value * 100) / 100;