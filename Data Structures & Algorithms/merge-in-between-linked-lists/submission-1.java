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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
       ListNode t1=list1;
       ListNode p1=null;
       for(int i=0;i<a;i++){
        p1=t1;
        t1=t1.next;
       }
       ListNode t2=t1;
       for(int i=a;i<b;i++){
        t2=t2.next;
       }
       ListNode prev=null;
       ListNode t=list2;
       while(t!=null){
        prev=t;
        t=t.next;
       }
       p1.next=list2;
       prev.next=t2.next;
        return list1;


    }
}
