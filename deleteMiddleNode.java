class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next==null)
            return null;
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        if(slow.next!=null && slow!=null)
        {
        slow.val = slow.next.val;
        slow.next = slow.next.next;
      
        }
     else
        { head.next=null;
         }
    
          return head;
    }
}
