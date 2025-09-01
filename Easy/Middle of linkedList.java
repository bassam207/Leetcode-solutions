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
    public ListNode middleNode(ListNode head) {


      // two pointers one moves one step and one moves two steps so if the fast reachs the end the slow one will be in the middle of linkedlist 
            ListNode fast = head;
             ListNode slow = head;

      // two checks condition , one to check validity of fast.next and the other to check fast.next.next
             while(fast != null && fast.next != null)
             {
               fast = fast.next.next;
            slow = slow.next;

             }


return slow;
        
    }
}
