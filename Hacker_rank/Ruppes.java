package Hacker_rank;
import java.text.*;
import java.util.*;
public class Ruppes {
    public static void main(Str1[] args) {
        Scanner sc = new Scanner(System.in);
        double payment = sc.nextDouble();

        // Locales
        Locale us = Locale.US;
        Locale india = new Locale("en", "IN"); // India doesn't have a built-in constant
        Locale china = Locale.CHINA;
        Locale france = Locale.FRANCE;

        // Currency formatters
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(us);
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(india);
        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(china);
        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(france);

        // Print formatted currencies
        System.out.println("US: " + usFormat.format(payment));
        System.out.println("India: " + indiaFormat.format(payment));
        System.out.println("China: " + chinaFormat.format(payment));
        System.out.println("France: " + franceFormat.format(payment));
    }
}


