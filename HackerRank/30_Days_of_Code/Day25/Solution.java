import java.io.*;
import java.util.*;

public class Solution {

static boolean isPrime(int n) {
    
    if(n<=1){
        return false;
    }
    for(int i=2; i*i<=n;i++){
        
        if(n%i==0){
            return false;
        }   
    }
    
    return true; 
}
    public static void main(String[] args) {
     
     Scanner scan = new Scanner(System.in);
    int t = scan.nextInt();
    
    while(t-->0){
        int n= scan.nextInt();
        if(isPrime(n)){
            System.out.println("Prime");
        } else{
            System.out.println("Not prime");
        }
          
    }
    scan.close();
    
    
}
}
