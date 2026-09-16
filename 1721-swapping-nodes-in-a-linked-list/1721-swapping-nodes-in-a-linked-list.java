//using linkedlist
class Solution {
    public int count(ListNode head){
        int c = 0;
        while( head != null){
            c++;
            head = head.next;
        }
        return c;
    }
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp = head;
        int len = count(head);
        int[] arr = new int[len];
        int i = 0; //LL--->array
        while(temp != null){
            arr[i] = temp.val;
            i++;
            temp = temp.next;
        }
        ListNode dummy = new ListNode(0);
        ListNode res = dummy;
            int t = arr[k -1]; //swap k from beginning
            arr[k-1] = arr[len-k]; //k from end
            arr[len-k] = t;
        
        for(int j =0; j< len; j++){
            res.next = new ListNode(arr[j]);
            res = res.next;
        }
        return dummy.next;
    }
}