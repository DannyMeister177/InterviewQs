package src.reverse_integer;

class Solution {
    public static int reverse(int x) {
        int xReversed = 0;
        String xStr = Integer.toString(x);
        try {
            int signFactor = 1;
            if(x<0) {
                signFactor = -1;
                xStr = xStr.substring(1);
            }

            for(int i=xStr.length()-1; i>=0; i--){
                int signedDigit = signFactor*Integer.parseInt(xStr.substring(i, i+1));
                int signedMagn = Math.multiplyExact(signedDigit, (int) Math.pow(10, i));
                xReversed = Math.addExact(xReversed, signedMagn);
            }
        } catch (ArithmeticException  e) {
            return 0;
        }
        return xReversed;
    }

    public static void main(String[] args){
        System.out.println("x is: " + args[0]);
        try {
            Integer.parseInt(args[0]);
            System.out.println(Solution.reverse(Integer.parseInt(args[0])));
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException thrown. ");
            System.out.println("Let's see what reverse does...");
            System.out.println(Solution.reverse(Integer.parseInt(args[0])));
        }
    }
}
