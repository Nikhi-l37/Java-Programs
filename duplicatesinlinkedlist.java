class Solution {
    Node removeDuplicates(Node head) {
        if (head == null) return null;
        
        Node curr = head;
        
        while (curr.next != null) {
            if (curr.data == curr.next.data) {
                // Just skip the next node. 
                // Don't move 'curr' yet, because the NEW next might also be a duplicate!
                curr.next = curr.next.next;
            } else {
                // Only move 'curr' forward if the next node is different
                curr = curr.next;
            }
        }
        
        return head;
    }
}
