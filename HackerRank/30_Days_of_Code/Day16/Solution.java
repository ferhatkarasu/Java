public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String S = bufferedReader.readLine();
        bufferedReader.close();
        int number;
        try {
            number = Integer.valueOf(S);
            System.out.println(number);
            
        } catch (NumberFormatException e) {
            System.out.println("Bad String");
        }
    }
    
}
