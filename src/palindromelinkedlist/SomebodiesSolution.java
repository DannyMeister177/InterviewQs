package src.palindromelinkedlist; 

public class SomebodiesSolution{
    public static boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            ListNode temp = slow;
            slow = slow.next;
            temp.next = prev;
            prev = temp;
        }
        //Handling for odd length linked list
        if (fast != null) slow = slow.next;
        while (prev != null && slow != null) {
            if (prev.val != slow.val) return false;
            prev = prev.next;
            slow = slow.next;
        }
        return prev == null && slow == null;
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
