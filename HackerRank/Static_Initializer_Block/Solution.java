import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    private static int B;   
    private static int H;
    private static boolean flag=false;
    static{
        Scanner scan = new Scanner(System.in);
        B = scan.nextInt();
        H = scan.nextInt();
        flag = B>0 && H>0;
        if(!flag){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        scan.close();
        
    }

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}

}

