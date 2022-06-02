package mergeklists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ListNode {
    int val;
    ListNode next;
    ListNode() {};
    ListNode(int val) {this.val = val; }
    ListNode(int val, ListNode next) {this.val = val; this.next = next;}
}
public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> arr = new ArrayList<Integer>();
        for (ListNode ln : lists) {
            while (ln != null) {
                arr.add(ln.val);
                ln = ln.next;
            }
        }

        Collections.sort(arr);

        ListNode head = new ListNode(0);
        ListNode h = head;
        for (int i : arr) {
            ListNode t = new ListNode(i);
            h.next = t;
            h = h.next;
        }
        h.next = null;
        return head.next;
    }
}
