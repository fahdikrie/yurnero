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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode solution = new ListNode();

        ListNode ptrSolution = solution;
        ListNode ptr1 = l1;
        ListNode ptr2 = l2;

        int carryOver = 0;

        while (ptr1 != null || ptr2 != null) {
            int l1Val, l2Val;
            l1Val = ptr1 != null ? ptr1.val : 0;
            l2Val = ptr2 != null ? ptr2.val : 0;

            System.out.println(l1Val);
            System.out.println(l2Val);

            int sum = l1Val + l2Val + carryOver;

            System.out.println(sum);
            System.out.println(sum % 10);
            System.out.println(carryOver);
            System.out.println();

            carryOver = sum >= 10 ? 1 : 0;

            ptrSolution.val = sum % 10;

            if (ptr1 != null) {
                ptr1 = ptr1.next != null ? ptr1.next : null;
            }

            if (ptr2 != null) {
                ptr2 = ptr2.next != null ? ptr2.next : null;
            }

            if (ptr1 != null || ptr2 != null) {
                ListNode newListNode = new ListNode();
                ptrSolution.next = newListNode;
                ptrSolution = newListNode;
            }
        }

        if (carryOver > 0) {
            ptrSolution.next = new ListNode(carryOver);
        }

        return solution;
    }
}