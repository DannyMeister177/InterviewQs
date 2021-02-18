package src.palindromelinkedlist;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    /**
     * This method uses memory O(n) since it fills a stack with values of linked list
     * to then compare each item in list to stack.
     * @param head of linked list to evaluate
     * @return true of linked list evaluated is palindrome
     */
    public static boolean isPalindrome(ListNode head) {
        Deque<Integer> stack = new ArrayDeque<>();
        ListNode current = head;

        // get size of linked list
        int size = 0;
        while(current != null){
            size++;
            stack.push(current.val);
            current = current.next;
        }

        // now compare each item in list to each value in stack and if not equal, this
        // is not a palindrome.
        current = head;
        for(int i=0; i<size/2; i++){
            if(current.val != stack.pop()) return false;
            else current = current.next;
        }

        // if exited loop, must mean each int equals opposite int so is
        return true;
    }

    public static void main(String[] args){
        int first = Integer.parseInt(args[0]);
        int next = Integer.parseInt(args[1]);
        ListNode head = new ListNode(first, new ListNode(next));
        ListNode curr = head;

        for(int i=2; i<args.length; i++){
            curr.next.next = new ListNode(Integer.parseInt(args[i]));
            curr = curr.next;
        }

        System.out.println("head: "+head.val);
        System.out.println(isPalindrome(head));
    }
}
