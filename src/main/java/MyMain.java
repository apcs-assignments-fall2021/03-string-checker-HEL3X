import java.util.Scanner;

public class MyMain {
    
    // Counts the number of 'a', 'b', and 'c' chars in str
    public static int countABC(String str) {
        int counter = 0;
        for (int i = 0; i<str.length(); i++){
            if (str.charAt(i) == 'a'){
                counter = counter + 1;
            }else if (str.charAt(i) == 'b'){
                counter = counter + 1;
            }else if (str.charAt(i) == 'c'){
                counter = counter + 1;
            }else{
                counter = counter + 0;
            }
        }
        return counter;
    }

    // Checks to see whether or not str contains 'The' or 'the'
    public static boolean containsThe(String str) {
        if (str.contains("The") || str.contains("the")){
            return true;
        }else{
            return false;
        }
    }

    // Checks whether str is a palindrome or not
    public static boolean isPalindrome(String str) {
        if(str.equals(str.substring(str.length(), 0)){
            return true;
        }else{
            return false;
        }
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // YOUR CODE HERE
    }
}
