package src.power_of_two;

class Solution {
    public static boolean isPowerOfTwoConvoluted(int n) {
        // first take care of a few edge cases for performance and to simplify code below
        if (n == 1 || n == 1073741824) 
            return true;
        if ((n&1) == 1 || n <= 0) 
            return false;

        // now iterate through each bit position and count total number of one-bits
        // if bitCount exceeds 1, n is not a power of two so return false
        int mask = 2;
        int bitCount = 0;
        while (mask<=n && bitCount<=1){
            if((mask&n)==mask) bitCount++;
            if(mask>n) bitCount++;
            mask <<= 1;
        }

        return bitCount==1;
    }
    
    public static boolean isPowerOfTwo(int n) {
        return n>0 && (n&(n-1))==0;
    }

    public static void main(String[] args){
        for (String string : args) {
            System.out.println(string+" = "
            + isPowerOfTwo(Integer.parseInt(string)));
        }
    }
}
