package palindrome_number;

public class Solution {
    public static boolean isPalindrome(int x) {
        // preliminary checks to increase speed
        if(x<0) return false;
        if(x<10) return true;
        if(x%10==0) return false;
        // now check each digit to the digit "opposite" to it and if left and right
        // digits are not equal, return false.
        int length = (int) (Math.log10(x) + 1);
        for(int i =0; i<length-1; i++){
            if(i>=length-1-i) break;
            int leftDigit = (int) (x / Math.pow(10.0, length-1.0-i)) % 10;
            int rightDigit = (int) (x / Math.pow(10.0, (double) i)) % 10;
            if(leftDigit != rightDigit) return false;
        }
        return true;
    }

    public static void main(String[] args){
        int x = Integer.parseInt(args[0]);
        int length = (int) (Math.log10(x) + 1);
        System.out.printf("x is %,d%n", x);
        System.out.println("Length of x is " + length);
        System.out.println(Solution.isPalindrome(x));
    }
}