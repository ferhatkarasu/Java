import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    
    public static void solve(double meal_cost, double tip_percent, double tax_percent) {
 

        double totalCost= (meal_cost/100)*tip_percent;
        double totalTax= (tax_percent/100)*meal_cost;
        double totalPrice=meal_cost+totalCost+totalTax;
        int totalInt = (int) Math.round(totalPrice);
        System.out.println(totalInt);
}
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        double meal_cost = Double.parseDouble(bufferedReader.readLine().trim());

        double tip_percent = Double.parseDouble(bufferedReader.readLine().trim());

        double tax_percent = Double.parseDouble(bufferedReader.readLine().trim());

        Result.solve(meal_cost, tip_percent, tax_percent);

        bufferedReader.close();
    }
}
