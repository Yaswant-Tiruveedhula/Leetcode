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
    public ListNode sortList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode left=null;
        ListNode right=null;
        if(head.next.next==null){
           right= sortList(head.next);
            head.next=null;
            left=sortList(head);
        }else{
        ListNode slow=head,fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        fast=slow.next;
        slow.next=null;
         left=sortList(head);
         right=sortList(fast);
    }
        return merge(left,right);
    }
    public ListNode merge(ListNode cur1,ListNode cur2){
        if(cur1==null){
            return cur2;
        }
        if(cur2==null){
            return cur1;
        }
        if(cur1.val<cur2.val){
            cur1.next=merge(cur1.next,cur2);
            return cur1;
        }else{
            cur2.next=merge(cur1,cur2.next);
            return cur2;
        }
    }
}