
// using fast and slow technique 
// fast pointer will reach the end when the 
// slow will be at middle;

public class MiddleOfTheLinkedList {
 
    public ListNode middleNode(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
        }
        return slow;
        }
    
}
}