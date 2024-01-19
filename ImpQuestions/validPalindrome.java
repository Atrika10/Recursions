import java.util.*;
public class validPalindrome {

    // This function will check; is given string is palindrome or not in O(n) Time complexity & O(1) space Complexity
    public static boolean checkPalindrome(String s, int st, int end){

        // base case
        if(st >= end){
            return true; // all letters have been compared
        }

        // work
        if(s.charAt(st) != s.charAt(end)){
            return false;
        }

        // inner call
        return checkPalindrome(s, st+1, end-1);

    }

    // This function will convert String into lowercase & also remove non-alphanumeric char or space
    // Time & Space Complexity => O(n), where n is the size of the given string.

    public static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if( (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') ||
                (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || 
                (s.charAt(i) >= '0' && s.charAt(i) <= '9')  ) {
                    // add char in sb
                    char ch = Character.toLowerCase(s.charAt(i));
                    sb.append(ch);
                }
        }
        String newS = sb.toString();
        return checkPalindrome(newS, 0, newS.length()-1);
    }
    public static void main(String[] args) {
        String s = "rac5 , 5car";
        System.out.println(isPalindrome(s));
    }
}
