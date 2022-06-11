/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
       
        
        //Phase 1
        ListNode dummy=new ListNode(0,head);
        
        ListNode LP=dummy;
        ListNode current=head;
        
        for(int i=0;i<left-1;i++){
            LP=current;
            current=current.next;
        }
        
        
        //Phase 2 
        
        ListNode prev=null;
        for(int i=0;i<right-left+1;i++){
            ListNode next=current.next;
            //imp part
            current.next=prev;
            prev=current;
            current=next;
        }
        
        //Phase 3
        
        LP.next.next=current;
        LP.next=prev;
        
        return dummy.next;
}
}