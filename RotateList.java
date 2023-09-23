// first find tail then find new k which will be k% ll length

// then traverse the k len;

// set current next to new head
// then next to null
// and last update the tail next to older head;


class RotateList {

    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null){
            return head;
        }

        ListNode tail=head;
        int len=1;
        while(tail.next!=null){
            tail=tail.next;
            len++;
        }

        int rotation=k%(len);
        if(rotation==0){
            return head;
        }
       
        int i=0;
        
        ListNode current=head;
        while(i<len-rotation-1){
           current = current.next;
           i++;
       }
        ListNode newHead=current.next;
       current.next=null;
       tail.next=head;
      
       return newHead;


    }
}