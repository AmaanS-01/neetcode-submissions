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
    public static ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode next=null;
        ListNode curr=head;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null||head.next==null)return head;
        ListNode head1 = null;
        ListNode tail = null;
        while (true) {
            if (head == null) break;
            ListNode temp = head;
            ListNode prev = head;
            int count = 0;
            for (int i = 0; i < k; i++) {
                if (temp == null) break;
                count++;
                prev = temp;
                temp = temp.next;
            }
            if (count < k) {
            if (tail != null)
                tail.next = head;
            if(head1==null)return head;
            else return head1;
            }
            ListNode groupTail = head;
            prev.next = null;
            ListNode a = reverse(head);
            if (head1 == null) {
                head1 = a;
            } else {
                tail.next = a;
            }
            groupTail.next = temp;
            tail = groupTail;
            head = temp;
        }
        return head1;
        
        }
    }
