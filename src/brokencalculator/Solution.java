package src.brokencalculator;

import java.util.Arrays;

public class Solution {

    public static int brokenCalc(int x, int y) {
        if(y <= x) return x-y;

        
        return 0;
    }

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("\n\nSample command line args: " + "java Solution.java helllooo helo hello");
            System.out.println("\n");
            System.exit(0);
        }

    }
}
