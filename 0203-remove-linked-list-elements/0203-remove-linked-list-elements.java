 //using new function skip 
class Solution {
    ListNode dummy = new ListNode(0); //head is dummy
    ListNode res = dummy; //traversal in LL
    public void createLL(int x){ //jo val ke equal nhi hai
        res.next = new ListNode(x);
        res = res.next;
    }
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp = head;
        while(temp != null){
            if(temp.val != val){
                createLL(temp.val);
            }
            temp = temp.next;
        }
        //return the linked list
        return dummy.next;
    }
}