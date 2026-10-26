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
    public ListNode reverseKGroup(ListNode head, int k) {
        int g=0 ;
        ListNode cur = head ;
        while(cur!=null && g<k){
            cur = cur.next;
            g++;
        }
        if(g==k){
            cur = reverseKGroup(cur,k);
            while(g-- > 0){
                ListNode tmp = head.next ;
                head.next = cur ;
                cur = head ;
                head = tmp ;
            }
            head = cur;
        }

        return head ;
    }
}
