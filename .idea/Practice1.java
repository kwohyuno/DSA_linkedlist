/*
 * Leetcode #141. Linked List Cycle
 * */


public class Practice3 {

    Set<Integer> set = new HashSet<>();

    public boolean hasCycle(ListNode head) {
        while(head.next!=null){
            if(!set.contains(head.next.val)){
                set.add(head.next.val);
                head = head.next;
            }else{
                return true;
            }
            head = head.next;
        }
        return false;
    }
}

