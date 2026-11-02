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
        ListNode p=null;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            p=slow;
            slow=slow.next;
        }
        ListNode temp1=p.next;
        p.next=null;
        ListNode prev=null;
        ListNode curr=temp1;
        ListNode next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        temp1=prev;
        ListNode temp=head;
        while(temp1!=null&&temp!=null){
            if(temp1.val!=temp.val)return false;
            temp=temp.next;
            temp1=temp1.next;
        }
        return true;
    }
}