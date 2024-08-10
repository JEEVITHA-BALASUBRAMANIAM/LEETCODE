public class Solution
{
    public ListNode detectCycle(ListNode head)
    {
        if(head==null||head.next==null)
        {
             return null;
        }
         ListNode temp = head; 
         int index = 0; 
         HashMap<ListNode,Integer> map = new HashMap<>(); 
         while(temp!=null)
         {
             if(map.containsKey(temp))
             {
               return temp;
             } 
             map.put(temp,index); 
             temp = temp.next; 
             index++;
         } 
         return null;
    }
}