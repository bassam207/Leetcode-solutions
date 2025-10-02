class Solution
  { 
    public ListNode removeNthFromEnd(ListNode head, int n) 
   {
     //in case that the head is the wanted node
     ListNode dummy = new ListNode(0);
     dummy.next = head;
     ListNode slow = dummy; 
     ListNode fast = dummy; 
     //moving the fast n+1 movments to make slow pointer be at the node before the wanted one
     for(int i = 0 ; i < n+1;i++)
       { fast = fast.next; } 
     //when fast pointer refers to null , the slow will do for the node before the wanted
     while(fast != null)
       { fast = fast.next; slow = slow.next; } 
     // making the n-1 node , its next pointing to the n+1
     slow.next = slow.next.next; 
     return dummy.next; 
   }
  }
