class Solution {
    public boolean isPalindrome(ListNode head) {
        // calculate length
        int l = 0;
        ListNode node = head;
        while (node != null) {
            l += 1;
            node = node.next;
        }
        if (l == 0 || l == 1) return true;
        
        // reverse the second half
        node = head;
        if (l % 2 == 0) {
            for (int i = 0; i < l / 2 - 1; ++i) {
                node = node.next;
            }
            ListNode tail = node;
            node = node.next;
            tail.next = null;
        } else {
            for (int i = 0; i < l / 2 - 1; ++i) {
                node = node.next;
            }
            ListNode tail = node;
            node = node.next.next;
            tail.next = null;
        }
        node = reverseList(node);
        
        // compare both half
        while (head != null) {
            if (head.val != node.val) return false;
            head = head.next;
            node = node.next;
        }
        return true;
    }
    
    private ListNode reverseList(ListNode head) {
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
