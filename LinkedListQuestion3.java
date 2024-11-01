//check if the linked list has a cycle.

public class LinkedListQuestion3 {
    public boolean hasCycle(ListNode head) {
        ListNode turtle = head;
        ListNode hare = head;

        while(hare != null && hare.next != null) {
            turtle = turtle.next;
            hare = hare.next.next;
        
            if(hare == turtle) {
                return true;
            }
        }

        return false;
    }
     
}