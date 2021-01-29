package reverse_integer;

class Solution {
    public static int reverse(int x) {
        StringBuilder xStrBuilder = new StringBuilder(Integer.toString(x));
        boolean isNegative = x<0;
        if(isNegative) xStrBuilder.deleteCharAt(0);

        // iterate through string representation of x in reverse order and
        // append to xStrReverse
        int length = xStrBuilder.length();
        for(int i=0; i<length-1; i++){
            xStrBuilder.insert(i, xStrBuilder.charAt(length-1));
            xStrBuilder.deleteCharAt(length);
        }

        if(!isNegative) {
            return Integer.parseInt(xStrBuilder.toString());
        }
        else{
            xStrBuilder.insert(0,"-");
            return Integer.parseInt(xStrBuilder.toString());
        }
    }

    public static void main(String[] args){
        // System.out.println(Integer.parseInt(args[0]));
        System.out.println(Solution.reverse(Integer.parseInt(args[0])));
    }
}
