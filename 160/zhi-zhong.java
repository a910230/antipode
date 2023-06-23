public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int n = getLength(headA);
        int m = getLength(headB);
        
        if (n > m) {
            for (int i = 0; i < n - m; ++i) {
                headA = headA.next;
            }
        } else if (n < m) {
            for (int i = 0; i < m - n; ++i) {
                headB = headB.next;
            }
        }      
        
        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }
        
        return headA;      
    }
    
    private int getLength (ListNode head) {
        ListNode node = head;
        int l = 0;
        while (node != null) {
            node = node.next;
            l += 1;
        }
        return l;
    }
}
