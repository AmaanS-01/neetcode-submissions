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
    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null)return true;
        ListNode fast=head;
        ListNode slow=head;
        ListNode temp=null;
        while(fast!=null&&fast.next!=null){
            temp=slow;
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode head1=temp.next;
        temp.next=null;
        ListNode curr=head1;
        ListNode prev=null;
        ListNode next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head1=prev;
        while(head1!=null&&head!=null){
            if(head1.val!=head.val){
                return false;
            }
            head1=head1.next;
            head=head.next;
        }
        return true;
    }
}