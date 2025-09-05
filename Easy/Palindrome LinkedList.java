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
    public boolean isPalindrome(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

  

    while(fast != null && fast.next != null)
    {
        slow = slow.next;
         fast = fast.next.next;
    }

    if(fast != null){slow = slow.next;}

    ListNode first = head;
    ListNode sec = reverse(slow);

    while(sec != null)
    {
        if (first.val != sec.val) {return false;}

        first = first.next;
        sec = sec.next;
    }
return true;
    }
    

    public ListNode reverse(ListNode head)
    {
        if(head == null || head.next == null)
        {
            return head;
        }

        ListNode newnode = reverse(head.next);

        head.next.next = head;
        head.next = null;
        return newnode;
    }
        
    
}
