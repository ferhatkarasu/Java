import java.io.*;
import java.util.*;

public class Solution {

    Stack<Character> stack = new Stack<>();
    Queue<Character> queue = new LinkedList<>();
    
    void pushChar(char x){
        stack.push(x);
    }
    
    char popChar(){
        return stack.pop();
    }
    
    void enqueueChar(char x){
        queue.offer(x);
    }
    
    char dequeueChar(){
        return queue.poll();
    }
    
    
        
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String input=sc.next();
        sc.close();
        
        char[] inputConvertChar = input.toCharArray();
        
        Solution s = new Solution();
        
        for(char tempChar:inputConvertChar){
            s.pushChar(tempChar);
            s.enqueueChar(tempChar);
        }
        boolean isPalindrome= true;
        
        for(int i=0; i<=input.length()/2;i++){
           
           if(s.popChar() != s.dequeueChar()){
                isPalindrome= false;
                break;
           }
        }
        
        System.out.println(((isPalindrome) ? "Yes":"No"));
        
        
        
        
        
        
        
        
  
        
        
    }
}



