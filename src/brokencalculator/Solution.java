package src.brokencalculator;

public class Solution {

    public static int brokenCalc(int x, int y) {
        // take care of simple case since can only get to y by single step decrements
        if (y <= x)
            return x - y;

        /*
         * iterate through shortest path from y down to x. This is accomplished by
         * checking if current target is above or below x and whether it is even or odd
         */
        int stepCount = 0;
        int target = y;

        while (target != x) {
            boolean targetGreaterThanX = target > x;
            boolean targetIsEven = target % 2 == 0;
            if (targetGreaterThanX) {
                if (targetIsEven)
                    target /= 2;
                else
                    target += 1;

                stepCount++;
            } else {
                stepCount += x - target;
                target += x - target;
            }
        }

        return stepCount;
    }

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("\n\nPlease enter command line arguments.\n");
            System.out.println("Sample command line args: ");
            System.out.println("14 15");
            System.out.println("-------");
            System.out.println("5 17");
            System.out.println("-------");
            System.out.println("24 17");
            System.out.println("\n");
            System.exit(0);
        }

        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        System.out.println("Arguments entered: x=" + x + ", y=" + y);
        System.out.println("Shortest number of operations to get from x to y using" + "broken calculator:");
        System.out.println("\n" + brokenCalc(x, y));
    }
}
