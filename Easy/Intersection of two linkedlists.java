public class Solution {

    /**
     * Finds the intersection node of two singly linked lists, if it exists.
     *
     * @param headA the head of the first linked list
     * @param headB the head of the second linked list
     * @return the intersection node if it exists, otherwise null
     *
     * Approach:
     * 1. Compute the lengths of both linked lists.
     * 2. Move the pointer of the longer list forward by the length difference
     *    so that both pointers have the same number of nodes left to traverse.
     * 3. Traverse both lists in parallel until the pointers meet.
     *    - If they meet on a node → that node is the intersection.
     *    - If they both reach null → no intersection.
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
// Edge case: if either list is empty, no intersection
    if(headA == null || headB == null) return null;


       // Step 1: calculate length of list A
  ListNode  currA = headA;
  int numA = 0;
    while(currA != null)
    {
        numA++;
        currA = currA.next;

    }
 // Step 1: calculate length of list B
    ListNode  currB = headB;
  int numB = 0;
    while(currB != null)
    {
        numB++;
        currB = currB.next;

    }

      // Step 2: reset pointers to heads
    
    currA = headA;
    currB = headB;

       // Step 2: align the starting positions
    if (numA > numB)
    {
        int diff = numA - numB;
        while(diff > 0)
        {
            currA = currA.next;
            diff--;
        }

    }


    else if (numB > numA)

     {
        int diff = numB - numA;
        while(diff > 0)
        {
            currB = currB.next;
            diff--;
        }

    }

       // Step 3: traverse both lists together until intersection is found
    while(currA != currB)
    {
         currA = currA.next;
          currB = currB.next;
    }


      // Either intersection node or null (if no intersection)
    return currA;


        
    }
}
