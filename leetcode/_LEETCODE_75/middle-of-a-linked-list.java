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
     * O(n + 1/n) -> O(n) solution
     * @param head
     * @return
     */
    public ListNode middleNode(ListNode head) {
        ListNode ptr = head;
        int length = 0;

        while (ptr != null) {
            ptr = ptr.next;
            length++;
        }

        int mid = (int) Math.floor(length / 2);

        for (int i = 0; i < mid; i++) {
            head = head.next;
        }

        return head;
    }

    /**
     * Two pointer solution
     * @param head
     * @return
     */
    public ListNode middleNodeTwoPtr(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}