package lc160;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    /**
     * 第一遍把A放进set里 第二遍把第一个一样的返回
     */

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> hashSet = new HashSet<ListNode>();
        ListNode tmp = headA;
        while (tmp != null) {
            hashSet.add(tmp);
            tmp = tmp.next;
        }
        tmp = headB;
        while (tmp != null) {
            if (hashSet.contains(tmp)) {
                return tmp;
            }
            tmp = tmp.next;
        }
        return null;
    }
}
