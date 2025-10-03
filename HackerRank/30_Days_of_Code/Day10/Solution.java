import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        String binary = Integer.toBinaryString(n);
        int count=0;
        int maxCount=0;
        
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                count++;          
                if (count > maxCount) {
                    maxCount = count;
                }
            } else {
                count = 0;
            }
        }

    System.out.print(maxCount);
        
        bufferedReader.close();
    }
}
