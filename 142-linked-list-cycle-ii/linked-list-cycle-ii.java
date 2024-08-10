public class Solution
{
    public ListNode detectCycle(ListNode head)
    {
        if(head==null||head.next==null)
        {
             return null;
        }
         ListNode fast = head, slow = head;
         while(fast!=null && fast.next!=null){
             fast=fast.next.next;
             slow=slow.next;
             if(fast==slow){
                slow=head;
                while(slow!=fast){
                    fast=fast.next;
                    slow=slow.next;
                    }
                    return slow;
                }
             }              
         return null;
    }
}