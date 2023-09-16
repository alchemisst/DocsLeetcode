/// reversing the linked list by using prev and current


public class ReverseLL {

    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null){return head;}
        ListNode prev=head;
        ListNode current = head.next;
        head.next=null;

        while(current!=null){
            ListNode next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }

        head=prev;
        return head;



        
    }
}