// Reversing the k group nodes
// make a dummy node and add it next to head then keep reversing the k group 
// by checking the condition if the k group exist or not



public class ReorderKgroup {

    public ListNode reverseKGroup(ListNode head, int k) {

        if(k==1){
            return head;
        }
        
        ListNode temp = new ListNode(0,head);
        ListNode dummy =temp;
        while(dummy.next!=null && valid(dummy.next,k)){

            dummy.next = reverse(dummy.next,k);
            for(int i=0;i<k;i++){
                dummy = dummy.next;
            }
        }

        return temp.next;
    }
    public ListNode reverse(ListNode node,int k){
        ListNode prev=null;
        ListNode current=node;
        int i=0;
        while(i<k){
            ListNode next = current.next;
            current.next=prev;
            prev=current;
            current=next;
            i++;
        }
        node.next=current;


        return prev;

    }



    public boolean valid(ListNode node,int i){
        
        int trav=0;
        while(trav<i-1){
           
            node=node.next;
            trav++;
            if(node==null){
                return false;
            }
        }
        return true;


    }
}





    
}
