
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp = head;
        while(head != null && head.val == val){
            head = head.next;
        }
        while(temp != null && temp.next != null){
            if(temp.next.val == val){
                temp.next = temp.next.next;
            }
            else temp = temp.next;
        }
        return head;
    }
}