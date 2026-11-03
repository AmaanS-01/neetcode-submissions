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
    public ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        ListNode next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null)return head;
        int n=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            n++;
        }
        k=k%n;
        if(k<=0)return head;
        head=reverse(head);
        temp=head;
        int i=0;
        while(i<k-1){
            temp=temp.next;
            i++;
        }
        ListNode head1=temp.next;
        temp.next=null;
        ListNode t1=reverse(head);
        ListNode t2=reverse(head1);
        ListNode ta=t1;
        ListNode temp1=null;
        while(ta!=null){
            temp1=ta;
            ta=ta.next;
        }
        temp1.next=t2;
        return t1;
    }
}