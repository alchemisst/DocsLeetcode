/**
 * PalindromeLL
 */


 // find the middle & reverse from that middle node and then compare




public class PalindromeLL {

  
        public boolean isPalindrome(ListNode head) {
            if(head==null || head.next==null){
                return true;
            }
    
            ListNode slow = head;
            ListNode fast = head;
    
            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
    
            ListNode current=slow;
            ListNode prev=null;
    
            while(current!=null){
                ListNode temp=current.next;
                current.next=prev;
                prev=current;
                current=temp;
            }
    
    
            ListNode first=head;
            ListNode second =prev;
            while(first!=null && second!=null){
                if(first.val!=second.val){
                    return false;
                }
                first=first.next;
                second=second.next;
    
            }
            return true;
    
    
    
    
    
        }
    }
}