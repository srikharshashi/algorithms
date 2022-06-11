package merge2LL;

//take a fake head and use that always

public class mergell {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head=new ListNode(-1);
        ListNode l1=list1;
        ListNode l2=list2;
        ListNode ptr=head;
        
        while(l1!=null && l2!=null){
            if(l1.val<=l2.val){
                ptr.next=l1;
                l1=l1.next;
            }
            else{
                 ptr.next=l2;
                 l2=l2.next;
            }
            ptr=ptr.next;
        }
        if(l1!=null){
              ptr.next=l1;
         
            
        }
        if(l2!=null){
           ptr.next=l2;
          
            
        }
        
        return head.next;
    }
}
