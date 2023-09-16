// we have to detect cycle in a linked list and return the node where the cycle started
// Using Floyd's hare and rabbit techinque where we use two pointer fast and slow where fast will move 2X the speed of slow and the time 
// they both become equal we will assignt he slow pointer to the head and fast will start from the point
// they become equal then we will both the pointer simultaneously at the same speed now whenever they become equual that will be the point
// where the cycle started

public class LinkedListCycle2 {

    public ListNode detectCycle(ListNode head) {
     
  
 
        ListNode fast =head;
        ListNode slow =head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                slow=head;
                while(fast!=slow){
                fast=fast.next;
                slow=slow.next;

            }
            return fast;
            
                
            }

        }
       
        return null;
        
    }
    
}
}
