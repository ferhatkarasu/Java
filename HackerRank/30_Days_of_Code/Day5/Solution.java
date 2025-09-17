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
        int total=0;
        for(int i=1;i<=10;i++){
            total=i*n;
            System.out.println(n+" x "+i+" = "+total);
        }
        
        bufferedReader.close();
    }
}
