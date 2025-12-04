import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        Locale us = new Locale("en", "US");
        Locale india = new Locale("en", "IN");
        Locale china = new Locale("zh", "CN");
        Locale france = new Locale("fr", "FR");

        
        System.out.println("US: " + NumberFormat.getCurrencyInstance(us).format(payment));
        System.out.println("India: " + NumberFormat.getCurrencyInstance(india).format(payment));
        System.out.println("China: " + NumberFormat.getCurrencyInstance(china).format(payment));
        System.out.println("France: " + NumberFormat.getCurrencyInstance(france).format(payment));
    }
}
