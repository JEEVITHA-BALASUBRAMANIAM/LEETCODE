class Solution
{
    public ListNode mergeKLists(ListNode[] lists)
    {
        if(lists.length==0)
        {
            return null;
        }
    PriorityQueue<ListNode> q = new PriorityQueue<>((a,b) -> a.val - b.val);
    for(ListNode node : lists)
    {
        if(node!=null)
        q.add(node);
    }
    ListNode dummy = new ListNode(-1); 
    ListNode temp = dummy;
    while(!q.isEmpty())
    {
        ListNode minNode = q.poll(); 
        temp.next = minNode; 
        temp = minNode; 
        if(minNode.next!=null)
        {
            q.add(minNode.next);
        }
    }
    return dummy.next;
    }
}