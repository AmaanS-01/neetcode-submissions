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
        ListNode temp=head;
        ListNode prev=null;
        ListNode next=null;
        ListNode curr=head;
        ListNode head1=null;
        ListNode tail=null;
        int i=1;
        if (left!=1){
        while(i<left){
            prev=temp;
            temp=temp.next;
            i++;
        }
        prev.next=null;
        curr=temp;
        }
        while(i<right){
            prev=temp;
            temp=temp.next;
            i++;
        }
        head1=temp.next;
        temp.next=null;
        tail=curr;
        prev=null;
        while(curr!=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
        }
        tail.next=head1;
        if(left==1)return prev;
        else{
            temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=prev;
        }
        return head;

        

    }
}