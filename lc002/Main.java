package lc002;

public class Main {
    public static void main(String[] args) {
        int x = 1001;
//        boolean ans = addTwoNumbers(x);
//        System.out.println(ans);
    }

    public static class ListNode {
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

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return add(l1, l2, 0);
    }
    public ListNode add(ListNode l1, ListNode l2, int carry) {
        if (l1 == null && l2 == null && carry == 0) {
            return null;
        }
        //最终的边界条件是都是0 包括进位 最后一次计算的carry会跳过两个if直接模10建立新节点
        int temp = carry;
        //不为空时，他们会与进位值相加，通过两个if
        if (l1 != null) {
            temp += l1.val;
            l1 = l1.next;
        }
        if (l2 != null) {
            temp += l2.val;
            l2 = l2.next;
        }
        ListNode node = new ListNode(temp % 10);
        //新的node将会依赖之后的next node 直到全为空结束
        node.next = add(l1, l2, temp / 10);
        return node;
    }

}