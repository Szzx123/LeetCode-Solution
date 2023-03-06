package lc203;

public class Main {
    public class ListNode {
        int val;
       ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    /**
     * 头插入一个哑元素 []-> 6 -> 5 -> 4 -> 6
     * 这样一来可以一直用ptr.next进行判断
     * 为val就直接指向ptr的下下位
     * 不用担心尾部是val的情况，因为指向空时，下一次while就会跳出，这样也解决了头上是val的情况
     * @param head
     * @param val
     * @return
     */
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode ptr = dummyHead;
        while (ptr.next != null) {
            if (ptr.next.val == val) {
                ptr.next = ptr.next.next;
            }else {
                ptr = ptr.next;
            }
        }
        return dummyHead.next;
    }
}
