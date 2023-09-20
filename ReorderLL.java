
// Just find the mid and reverse the list from next node
// then take one by one from each node and resulted ll will be the answer


/**
 * ReorderLL
 */
public class ReorderLL {

    public void reorderList(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode current=slow.next;
        slow.next=null;
        ListNode prev=null;

        while(current!=null){
            ListNode temp=current.next;
            current.next=prev;
            prev=current;
            current=temp;
        }
        



        ListNode first=head;
      
        ListNode second =prev;

        
        while(second!=null){
            ListNode tempFirst=first.next;
            ListNode tempSecond=second.next;
            first.next=second;
            second.next=tempFirst;
            first=tempFirst;
            second=tempSecond;

    

            
        }

        

 





    }
}

}