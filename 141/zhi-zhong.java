public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode ptr1 = move1(head);
        ListNode ptr2 = move2(head);
        
        while (ptr1 != ptr2) {
            ptr1 = move1(ptr1);
            ptr2 = move2(ptr2);
        }
        
        return ptr1 != null;
    }
    
    private ListNode move1(ListNode node) {
        if (node == null) return null;
        return node.next;
    }
    
    private ListNode move2(ListNode node) {
        return move1(move1(node));
    }
}
