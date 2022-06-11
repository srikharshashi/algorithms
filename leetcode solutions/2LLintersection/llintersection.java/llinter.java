/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       
        
        
        ListNode p1=headA;
        ListNode p2=headB;
        
        Map<ListNode,Integer> mapp=new HashMap<>();
        while(p1!=null)
        {
            mapp.put(p1,p1.val);
            p1=p1.next;
        }
        while(p2!=null)
        {
            if(mapp.containsKey(p2))
                return p2;
            
            p2=p2.next;
        }
        return null;
    }
}