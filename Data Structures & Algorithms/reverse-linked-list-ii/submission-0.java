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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode d = new ListNode(0);
        d.next = head ;
        ListNode lp = d ;
        ListNode prev = head ;
        ListNode c = head; 

        for(int i = 0 ; i < left-1 ; i++){
           lp=c;
           c=c.next;
        } 

        for(int i = 0 ; i < right-left+1 ; i++){
            ListNode tmp = c.next;
            c.next=prev;
            prev=c;
            c=tmp;
        }

        lp.next.next=c;
        lp.next=prev;

        return d.next;
    }
}