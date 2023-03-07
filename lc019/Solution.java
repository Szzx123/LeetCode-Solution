package lc019;

public class Solution {
//    public ListNode removeNthFromEnd(ListNode head, int n) {
//        int length = getLength(head);
//        if (n > length || head == null) return null;
//        ListNode dummyHead = new ListNode(0);
//        dummyHead.next = head;
//        ListNode pre = dummyHead;
//
//        for (int i = 0; i < length - n; i++) {
//            pre = pre.next;
//        }
//        pre.next = pre.next.next;
//        return dummyHead.next;
//    }
//
//    public static int getLength(ListNode head) {
//        int i = 0;
//        ListNode ptr = head;
//        while (ptr != null) {
//            ptr = ptr.next;
//            i++;
//        }
//        return i;
//    }
}
