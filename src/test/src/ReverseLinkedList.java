package src;

import org.junit.Test;

import java.util.Objects;

public class ReverseLinkedList {

    @Test
    public void run() {

        final Solution solution = new Solution();
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = new ListNode(5);
        ListNode result = solution.reverseList(listNode);
        while (Objects.nonNull(result)) {
            System.out.print(result.val + "->");
            result = result.next;
        }
        System.out.println("NULL");
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode r = null;
            ListNode cur = head;
            ListNode pre = null;
            while (cur != null) {
                ListNode next = cur.next;
                if (next == null) {
                    r = cur;
                }
                cur.next = pre;
                pre = cur;
                cur = next;
            }
            return r;
        }
    }
}
