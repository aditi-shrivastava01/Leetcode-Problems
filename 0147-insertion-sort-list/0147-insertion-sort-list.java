
class Solution {
    public ListNode insertionSortList(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        while(head != null){
            arr.add(head.val);
            head = head.next;
        }
        Collections.sort(arr);
        for (int x : arr) {
            temp.next = new ListNode(x);
            temp = temp.next;
        }
        return dummy.next;
    }
}