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
    public  ListNode merge(ListNode list1,ListNode list2){
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        while(list1!=null&&list2!=null){
            if(list1.val<list2.val){
                temp.next=list1;
                temp=temp.next;
                list1=list1.next;
            }
            else{
                temp.next=list2;
                temp=temp.next;
                list2=list2.next;
            }
        }
        if(list1==null)temp.next=list2;
        else if(list2==null)temp.next=list1;
        return dummy.next;
    } 
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0)return null;
        ListNode result=null;
       while (lists.length>1) {
            int n=(lists.length+1)/2;
            ListNode[] res=new ListNode[n];
            for (int i=0;i<lists.length;i += 2){
                if(i+1<lists.length)
                    res[i/2]=merge(lists[i],lists[i +1]);
                else
                    res[i/2]=lists[i];
            }
            lists=res;
        }
        return lists[0];
    }
}
