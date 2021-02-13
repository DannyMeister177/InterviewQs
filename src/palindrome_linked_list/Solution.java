package palindrome_linked_list;


// Definition for singly-linked list.
public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Solution {
    public static boolean isPalindrome(ListNode head) {
        return false;
    }

    public static void main(String[] args){
        ListNode current = new ListNode(args[0]);

        for(int i=1; i<args.length; i++){
            
            if(current.next == null) current.next = args[0];
        }

        System.out.println(isPalindrome(x));
    }
}
