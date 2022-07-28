import java.util.Scanner;
//Q_5->>> Calculate Distance Between Two Points.
public class DistanceBetweenTwoPoints {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1, x2, y1, y2;
        double distance = 0;
        System.out.println("Enter the coordinates of the first point x1: ");
        x1 = sc.nextInt();
        System.out.println("Enter the coordinates of the first point y1: ");
        y1 = sc.nextInt();
        System.out.println("Enter the coordinates of the second point x2: ");
        x2 = sc.nextInt();
        System.out.println("Enter the coordinates of the second point y2: ");
        y2 = sc.nextInt();

        //Distance formula
        distance = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));

        System.out.println("The distance between the two points is " + distance);

    }
}