
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
       ListNode slow = head;
       ListNode fast = head;
       for( int i = 0; i< k-1; i++){
        slow = slow.next; //slow fix hogya
       } 
       ListNode first = slow;
       while(slow.next != null){
        fast = fast.next;
        slow = slow.next;
       }
       ListNode second = fast;
       int temp = first.val;
       first.val = second.val;
       second.val = temp;
       return head;
    }
}