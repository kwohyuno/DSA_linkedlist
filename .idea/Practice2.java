/*
 * Leetcode #3062. Winner of the LinkedList Game
 * */


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Practice2 {
    public String gameResult(ListNode head) {

        int tmp = 0;
        int val1 = 0;
        int even = 0;
        int odd = 0;

        while (head!= null) {

            if (tmp % 2 == 0) {
                val1 = head.val;
            }
            else {
                if (val1 > head.val) {
                    even++;
                    val1=0;
                } else {
                    odd++;
                    val1=0;
                }
            }

            head = head.next; // Move to the next node
            tmp++;
        }

        if (even > odd) {
            return "Even";
        } else if (even < odd) {
            return "Odd";
        } else {
            return "Tie";
        }

    }
}