class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) {
            return head;
        }

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;

        for (int i = 0; i < left - 1; i++) {
            prev = prev.next;
        }

        ListNode cur = prev.next;
        ListNode end = cur;
        
        for (int i = 0; i < right - left; i++) {
            end = end.next;
        }
        
        ListNode temp = end.next;
        end.next = null;

        prev.next = reverse(cur);
        
        cur.next = temp;
        
        return dummy.next;
    }

    public static ListNode reverse(ListNode head) {
        ListNode p = head, q = null, r = null;
        while (p != null) {
            r = q;
            q = p;
            p = p.next;
            q.next = r;
        }
        return q;
    }
}
