class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode tail = dummy;
        ListNode curr = head;
        while (curr != null && curr.next != null)
        {
            ListNode nextPair = curr.next.next;
            tail.next = curr.next;
            curr.next.next = curr;
            curr.next = nextPair;
            tail = curr;
            curr = nextPair;
        }
        return dummy.next;
    }
}