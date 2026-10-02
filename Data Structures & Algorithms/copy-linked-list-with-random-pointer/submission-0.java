/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null){
            return head;
        }
        Node temp=head;
        Node nxt=null;
        while(temp!=null){
            Node newNode=new Node(temp.val);
            nxt=temp.next;
            temp.next=newNode;
            newNode.next=nxt;
            temp=temp.next.next;
        }
        temp=head;
        Node copy=null;
        while(temp!=null){
            copy=temp.next;
            if(temp.random!=null)
            copy.random=temp.random.next;
            temp=temp.next.next;
        }
        Node head1=head.next;
        temp=head;
        while(temp != null) {
             copy = temp.next;
            temp.next = copy.next;
            if(copy.next != null)
                copy.next = copy.next.next;
            temp = temp.next;
        }
        
        return head1;
    }

}