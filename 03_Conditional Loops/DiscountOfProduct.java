import java.util.Scanner;
//Ques -> Calculate Discount Of Product.

public class DiscountOfProduct {
    public static void main(String[] args) {
        double pro, disc, total;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the Price of Product: ");
        pro = in.nextDouble();
        disc = 0;

        if(pro >= 2000){
            disc = pro * 10/100;
        } else if (pro >= 1000) {
            disc = pro * 15/100;
        } else if (pro >= 500) {
            disc = pro * 20/100;
        }else{
            disc = pro * 25/100;
        }
        total = pro - disc;
        System.out.println("The Discount on the product is: "+disc);
        System.out.println("The total price of the product after discount: "+total);

    }
}