class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ret = addWithCarry(l1, l2, false);
        if (ret == null) return new ListNode(0);
        return ret;
    }
    
    private ListNode addWithCarry(ListNode l1, ListNode l2, boolean carry) {
        int total = 0;
        if (carry) total = 1;
        if (l1 != null) {
            total += l1.val;
            l1 = l1.next;
        }
        if (l2 != null) {
            total += l2.val;
            l2 = l2.next;
        }
        
        if (total == 0 && l1 == null && l2 == null) return null;
        if (total < 10) return new ListNode(total, addWithCarry(l1, l2, false));
        return new ListNode(total - 10, addWithCarry(l1, l2, true));
    }
}
