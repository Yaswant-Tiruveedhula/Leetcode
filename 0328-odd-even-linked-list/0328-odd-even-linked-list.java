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
    public ListNode oddEvenList(ListNode head) {
        if(head==null||head.next==null||head.next.next==null){
            return head;
        }
        
        // ListNode l1=new ListNode();
        // ListNode cur=l1;
        //  ListNode l2=new ListNode();
        // ListNode cur2=l2;
        ListNode ele=head.next;
        ListNode slow=head,fast=head.next;
        while(fast!=null&&fast.next!=null){
            ListNode odd=fast.next.next;
            ListNode eve=slow.next.next;
            fast.next=odd;
            slow.next=eve;
            fast=odd;
            slow=eve;
        //    if(slow==head){
        //     cur.next=head;
        //     slow=slow.next;
        //     fast=fast.next.next;
        //     head.next=null;
        //     head=cur;
        //    }else{
        //     cur2.next=slow;
        //     slow=slow.next.next;
        //     cur.next=fast;
        //     fast=fast.next.next;
        }
        slow.next=ele;
        return head;
    }
}