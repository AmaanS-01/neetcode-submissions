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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t1=l1;
        ListNode t2=l2;
        ListNode head=null;
        ListNode temp=null;
        int carry=0;
        
        while(t1!=null||t2!=null){
            int x=0;
            if(t1!=null){
                x+=t1.val;
            }
            if(t2!=null){
                x+=t2.val;
            }
            x+=carry;
            if(x>9){
                carry=x/10;
                x=x%10;
            }
            else{
                carry=0;
            }
            ListNode data=new ListNode(x);
            if(head==null){
                head=data;
                temp=head;
            }
            else{
                temp.next=data;
                temp=temp.next;
            }
            if(t1!=null){
            t1=t1.next;
            }
            if(t2!=null){
            t2=t2.next;
            }
        }
        if(carry>0){
            ListNode carr=new ListNode(carry);
            temp.next=carr;
            temp=temp.next;
        }
        return head;   
         }
}
