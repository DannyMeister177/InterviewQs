package src.longestpalindromicsubstring;

public class Solution {
    public static String longestPalindrome(String s) {
        int subStrSize = s.length();
        while(subStrSize > 1){
            for(int i=0; i+subStrSize<=s.length(); i++){
                String subStr = s.substring(i, i+subStrSize);
                if(isPalindrome(subStr)) return subStr;
            }
            subStrSize--;
        }
        // if code reaches here, no palindrome of siz > 1 so return one char
        // since this is technically a palindrome of size 1
        return s.substring(0, 1);
    }

    private static boolean isPalindrome(String s) {
        int head = 0;
        int tail = s.length() - 1;
        while(head<tail){
            if(s.charAt(head) != s.charAt(tail)) return false;
            else {head++; tail--;}
        }
        // if code reaches here, all chars equal their counterpart so s is a palindrome
        return true;
    }

    public static void main(String[] args){
        for (String string : args) {
            System.out.print("String: "+string+" has longest palindromic substring: ");
            System.out.println(longestPalindrome(string));
        }      
    }
}
