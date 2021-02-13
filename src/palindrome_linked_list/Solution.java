package palindrome_linked_list;

public class Solution {
    public static boolean isPalindrome(int x) {
        return false;
    }

    public static void main(String[] args){
        int x = Integer.parseInt(args[0]);
        int length = (int) (Math.log10(x) + 1);
        System.out.printf("x is %,d%n", x);
        System.out.println("Length of x is " + length);
        System.out.println(Solution.isPalindrome(x));
    }
}