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
    public void reorderList(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode curr=slow.next;
        slow.next=null;
        ListNode prev=null;
        ListNode next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;

        }
          ListNode head1=head;
        ListNode head2=prev;

        while(head1!=null&&head2!=null){
            ListNode next1=head1.next;
            ListNode next2=head2.next;
            head1.next=head2;
            head1=next1;
            head2.next=head1;
            head2=next2;
            

        }
      

    }
}
