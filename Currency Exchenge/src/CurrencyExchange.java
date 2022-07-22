// Q-> Input currency in rupees and output in USD.

import java.util.Scanner;

public class CurrencyExchange {
    public static void main(String[] args) {
        double Rupee, USD;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Rupee: ");
        Rupee = in.nextDouble();

        USD = Rupee / 79.85;
        System.out.println("Indian "+Rupee+" = "+USD+"$");
    }
}