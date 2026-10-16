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
    public int gcd(int a, int b){
        while(b!=0){
            int r=a%b;
            a=b;
            b=r;
        }
        return a;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head==null||head.next==null)return head;
        ListNode temp1=head;
        ListNode temp2=head.next;
        while(temp2!=null){
            int val=gcd(temp1.val,temp2.val);
            ListNode dummy=new ListNode(val);
            temp1.next=dummy;
            dummy.next=temp2;
            temp1=temp1.next.next;
            temp2=temp2.next;
        }
        return head;
    }
}