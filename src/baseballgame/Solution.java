package src.baseballgame;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

class Solution {

    public static int calPoints(String[] ops) {
        Deque<Integer> stack = new ArrayDeque<>((int) (ops.length*0.90));

        for (String s : ops) {
            if(s.equals("C")) stack.pop();
            else if(s.equals("D")) stack.push(2*stack.peek());
            else if(s.equals("+")) {
                int firstPrevScore = stack.pop();
                int secondPrevScore = stack.peek();
                stack.push(firstPrevScore);
                stack.push(firstPrevScore+secondPrevScore);
            }
            else stack.push(Integer.parseInt(s));
        }
        
        int sum = 0;
        for (int score : stack) sum += score;

        return sum;
    }

    public static void main(String[] args){
        System.out.println("\n\nOperations are:\n"+Arrays.toString(args)+"\n\n");
        System.out.println("Sum of ops is: "+calPoints(args));
        System.out.println("\n\n");
    }
}
