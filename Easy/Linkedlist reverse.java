/**

prev(null)    curr
    ↓         ↓
   null     [1] → [2] → [3] → [4] → null

prev
 ↓
[1] → null      curr
                ↓
              [2] → [3] → [4] → null

prev
 ↓
[2] → [1] → null     curr
                     ↓
                   [3] → [4] → null

prev
 ↓
[3] → [2] → [1] → null     curr
                            ↓
                          [4] → null

prev
 ↓
[4] → [3] → [2] → [1] → null
curr = null

*/



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

       ListNode prev = null;
       ListNode curr = head;
       ListNode nextn ;


       while( curr != null)
       {
        
            nextn = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextn;
       }

       return prev;
    }
}



// with recursion 
class Solution {
    public ListNode reverseList(ListNode head) {

       if (head == null || head.next == null)
       {
        return head;
       }

       ListNode newhead = reverseList(head.next);

       head.next.next = head;
       head.next = null;
       return newhead;
    }
}
