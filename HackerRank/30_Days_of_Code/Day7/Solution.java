import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int n =scan.nextInt();
        int[] arr = new int[n];
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        for(int j=0;j<n;j++){
            numbers[j]=arr[n-1-j];
            System.out.print(numbers[j]+" ");
            //System.out.print(" ");
        }
        
        scan.close();
    }
}
