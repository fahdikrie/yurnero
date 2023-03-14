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
class Solution {
    /**
     * Reverse by Iteration
     * @param head
     * @return ListNode
     */
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode prev = null;

        while (head != null) {
            ListNode tmpHead = head.next;
            head.next = prev;
            prev = head;
            head = tmpHead;

            System.out.println(prev != null ? prev.val : "null");
            System.out.println(tmpHead != null ? tmpHead.val : "null");
            System.out.println(" ");
        }

        return prev;
    }

    /**
     * Reverse by Recursion
     * @param head
     * @return ListNode
     */
    public ListNode reverseListWithRecursion(ListNode head) {
        return swapListNodeDirection(null, head);
    }

    /**
        - null, 1 (null <- 1)
        - 1, 2 (1 <- 2)
    */

    public ListNode swapListNodeDirection(ListNode prev, ListNode current) {
        if (current == null) {
            return prev;
        }

        ListNode tmpNext = current.next;
        current.next = prev;

        System.out.println(prev != null ? prev.val : "null");
        System.out.println(current != null ? current.val : "null");
        System.out.println(" ");

        return swapListNodeDirection(current, tmpNext);
    }
}
