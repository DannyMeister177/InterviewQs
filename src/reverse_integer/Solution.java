package reverse_integer;

class Solution {
    public static int reverse(int x) {
        int xReversed = 0;
        String xStr = Integer.toString(x);
        try {
            int signFactor = 1;
            if(x<0) signFactor = -1;
            
            for(int i=xStr.length()-1; i>=0; i--){
                var signedDigit = signFactor*Integer.parseInt(xStr.substring(i, i+1));
                var powOfTen = Math.pow(10, i);
                Math.addExact(xReversed, signedDigit*powOfTen);
            }
        } catch (Exception arithmeticException) {
            return 0;
        }
        return xReversed;
    }

    public static void main(String[] args){
        int x = Integer.parseInt(args[0]);
        String xString = Integer.toString(x);
        System.out.println(x);
        System.out.println(xString);
        // System.out.println(Solution.reverse(Integer.parseInt(args[0])));
    }
}
