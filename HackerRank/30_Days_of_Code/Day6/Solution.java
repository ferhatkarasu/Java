import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
      
        for(int i=0;i<t;i++){
            String word = in.next();
            String oddWords="";
            String evenWords="";
            
            for(int j=0;j<word.length();j++){
                if(j%2==0){
                    evenWords=evenWords+word.charAt(j);
                }
                else{
                    oddWords=oddWords+word.charAt(j);
                }
            }
            System.out.println(evenWords+" "+oddWords);
        }
        in.close(); 

    }
}
