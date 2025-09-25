class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        
    if (head == null || head.next == null || k == 0) return head;

      // counting length of ll
    int length = 1;
    ListNode temp = head;

    while (temp.next != null)
    {
        temp = temp.next;
        length++;
    }

      // turn to circular ll
    temp.next = head;

      // detection num of required effective rotations
    k = k % length;

      // detection of new tail
    int stepsforwardnewtail = length - k;
 ListNode newtail = head;
    for (int i = 1 ; i <stepsforwardnewtail ;i++)
    {
        newtail = newtail.next;
    }

      // detection of new head
    ListNode newhead = newtail.next;

      // break the circle
    newtail.next = null;

    return newhead;
        
    }
}
