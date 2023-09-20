// by using the dummy node so it easy to solve the edge cases easily

// iterating toh the node from which we have to reverse from 
// easy just understand the concept
// 


/**
 * ReverseLL2
 */
public class ReverseLL2 {

    public ListNode reverseBetween(ListNode head, int left, int right) {

    if(right==left){
        return head;
    }
    ListNode dummy = new ListNode(0,head);
    ListNode start =dummy;
    ListNode current = head;

    for(int i=0;  i<left-1 ;i++){
        start = current;
        current = current.next;
    }

    start.next = reverse(current,right-left);
    return dummy.next;




        
}
    public ListNode reverse(ListNode node,int diff){
        ListNode prev = null;
        ListNode current = node;
        for(int i=0; current!=null && i<=diff;i++){
            ListNode next =current.next;
            
            current.next=prev;
            prev=current;
            current=next;
        }
        node.next=current;
        return prev;
    }
}


}