
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        List<Integer> li = new ArrayList<>();
        while (list1 != null){
            li.add(list1.val);
            list1 = list1.next;
        }
        while (list2 != null){
            li.add(list2.val);
            list2 = list2.next;
        }
        Collections.sort(li);
        ListNode dummy = new ListNode(0);
        ListNode res = dummy;
        for (int x : li) {
            res.next = new ListNode(x);
            res = res.next;
        }
        return dummy.next;
    }
}