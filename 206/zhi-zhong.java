class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        ListNode last = null;
        ListNode next = head.next;
        
        while (next != null) {
            head.next = last;
            last = head;
            head = next;
            next = head.next;
        }
        
        head.next = last;
        return head;
    }
}
