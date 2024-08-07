class Solution {
    public ListNode oddEvenList(ListNode head)
    {

        if (head == null) return null;
        if (head.next == null) return head; 

        ListNode odd=head,even = head.next,even_start = head.next;
        while(even!=null && even.next!=null)
        {
            odd.next = odd.next.next; 
            even.next = even.next.next; 
            odd = odd.next; 
            even = even.next;
        }
            odd.next = even_start; 
            return head;

    }
}