package lc138;

public class Solution {
//    public Node copyRandomList(Node head) {
//        if (head == null) return null;
//        Node cur = head;
//        //第一步拼起来
//        while (cur != null) {
//            Node tmp = new Node(cur.val);
//            tmp.next = cur.next;
//            cur.next = tmp;
//            cur = tmp.next;
//        }
//        //第二步 看自己前面的指random
//        cur = head;
//        while (cur != null) {
//            if (cur.random != null) {
//                cur.next.random = cur.random.next;
//            }
//            cur = cur.next.next;
//        }
//        //第三步 拆开来
//        cur = head.next;
//        Node res = head.next, pre = head;
//        while (cur.next != null) {
//            pre.next = pre.next.next;
//            cur.next = cur.next.next;
//            pre = pre.next;
//            cur = cur.next;
//        }
//        pre.next = null;
//        return res;
//    }
}
