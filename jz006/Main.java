package jz006;

import java.util.Stack;

public class Main {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public int[] reversePrint(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        int count = 0;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
            count++;
        }
        int i = 0;
        int[] arr = new int[count];
        ListNode ptr = pre;
        while (ptr != null) {
            arr[i] = ptr.val;
            ptr = ptr.next;
            i++;
        }
        return arr;
    }
    public int[] reversePrintVStack(ListNode head) {
        Stack<Integer> res = new Stack<Integer>();
        ListNode ptr = head;
        while (ptr != null) {
            res.push(ptr.val);
            ptr = ptr.next;
        }
        int size = res.size();
        int[] ans = new int[size];
        for (int i = 0; i < size; i++) {
            ans[i] = res.pop();
        }
        return ans;
    }
}