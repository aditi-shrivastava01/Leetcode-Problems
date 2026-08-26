//(similar sort linked list)
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode dummy = new ListNode(0);
        ListNode res = dummy;
        for (int i = 0; i < lists.length; i++){
            ListNode temp = lists[i];
            while (temp != null) { //traverse krengy
                arr.add(temp.val);
                temp = temp.next;
            }
        }
        Collections.sort(arr);
        for (int x : arr) {
            res.next = new ListNode(x);
            res = res.next;
        }
        return dummy.next;
    }
}