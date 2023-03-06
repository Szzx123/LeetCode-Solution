package lc021;

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

    public static void main(String[] args) {

    }

    /**
     * 双指针链表 头节点为0 返回头的next 要注意要用p=node来操作
     * @param list1
     * @param list2
     * @return
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode node = new ListNode(0);
        ListNode p = node;
        //边界条件
        if (list1 == null) return list2;
        if (list2 == null) return list1;
//        int tmp;
        ListNode p1 = list1, p2 = list2;
        while (p1 != null || p2 != null) {
            if (p1 == null) {
                p.next = p2;
                p2 = p2.next;
            } else if (p2 == null) {
                p.next = p1;
                p1 = p1.next;
            } else if (p1.val < p2.val) {
                p.next = p1;
                p1 = p1.next;
            } else {
                p.next = p2;
                p2 = p2.next;
            }
            p = p.next;
        }
        return node.next;
    }
}
