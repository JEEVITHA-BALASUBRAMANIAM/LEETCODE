class Solution
{
    public ListNode deleteDuplicates(ListNode head)
    {
         if(head==null || head.next ==null)
         {
            return head;
         }
         ListNode temp1 = head; 
         ListNode temp2 = head.next; 
         while(temp2!=null)
         {
            if(temp1.val == temp2.val)
            {
                temp2 = temp2.next; 
            }
            else 
            {
                temp1.next = temp2; 
                temp1 = temp2; 
                temp2=temp2.next;
            }
         }  
         temp1.next = temp2;
         return head;
    }
}