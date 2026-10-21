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
       int i=0;
       ListNode t1=list1;
       ListNode prev=null;
       while(i<a&&t1!=null){
        prev=t1;
        t1=t1.next;
        i++;
       }
       while(i<=b&&t1!=null){
        t1=t1.next;
        i++;
       }
       ListNode temp=list2;
       ListNode t=null;
       while(temp!=null){
        t=temp;
        temp=temp.next;
       }
       prev.next=list2;
        t.next=t1;
        return list1;


    }
}
