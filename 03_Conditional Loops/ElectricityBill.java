import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        // For asking the user how much electricity they used,
        System.out.println("Enter the amount of kwh used in one month: ");
        double kwh = in.nextDouble();
        // for the cost of 1kwh.
        System.out.println("Enter the cost of the 1 kwh: ");
        double cost = in.nextDouble();
        double bill;

        if(kwh > 0 && cost > 0){
            bill = kwh * cost;
            //bill = bill / days;
            System.out.println("The bill is: " + bill);
        }
        else{
            System.out.println("Invalid input");
        }
    }
}