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
    public ListNode reverseList(ListNode head) {
        ListNode trav;
        ListNode back;
        ListNode forw;
        
        trav = head;
        back = null;

        while (trav != null){
            forw = trav.next;
            trav.next = back;
            back = trav;
            trav = forw;
        }
        return back;
    }
}
