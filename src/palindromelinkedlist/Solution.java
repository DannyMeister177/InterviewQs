package src.palindromelinkedlist;

public class Solution {
    public static boolean isPalindrome(ListNode head) {
        return false;
    }

    public static void main(String[] args){
        int first = Integer.parseInt(args[args.length-1]);
        int next = Integer.parseInt(args[args.length-2]);
        ListNode curr = new ListNode(first, new ListNode(next));

        for(int i=args.length-3; i>=0; i--){
            curr.next.next = new ListNode(Integer.parseInt(args[i]));
            curr = curr.next;
        }

        System.out.println(isPalindrome(curr));
        System.out.println("hello world");
    }
}
