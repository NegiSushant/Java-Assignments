import java.util.Scanner;

//Ques.12 -->>>>> Calculate Average Marks

public class AverageMarks {
    public static void main(String[] args) {
        double marks, sum, average;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the marks and enter -1 in last: ");
        marks = sc.nextDouble();

        sum = 0;
        int num = 0;

        while(marks!=-1)
        {
            sum+=marks;
            num++;
            marks = sc.nextDouble();
        }
        average = sum/num;

        System.out.println("Average: "+average);
    }
}