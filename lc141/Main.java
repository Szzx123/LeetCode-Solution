package lc141;

public class Main {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    /**
     * 快慢指针
     * @param head
     * @return
     */
    public boolean hasCycle(ListNode head) {
        //首先判断的边界是头或头的下一个为空
        if (head == null || head.next == null) return false;
        ListNode slow = head;
        ListNode fast = head.next;
        //一个是头，一个是头的下一个
        while (slow != fast) {
            //这意味着，最后没有环，fast会走两步，所以判断自身以及自身下一个，这能把各种情况都包含
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}
