package lc707;

public class Solution {
    class ListNode {
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val) {
            this.val=val;
        }
    }

    class MyLinkedList {

        int size;

        ListNode head;

        public MyLinkedList() {
            size = 0;
            head = new ListNode(0);
        }

        public int get(int index) {
            if (index < 0 || index >= size) {
                return -1;
            }
            ListNode ptr = head;
            for (int i = 0; i <= index; i++) {
                ptr = ptr.next;
            }
            return ptr.val;
        }

        public void addAtHead(int val) {
            addAtIndex(0, val);
        }

        public void addAtTail(int val) {
            addAtIndex(size, val);

        }

        public void addAtIndex(int index, int val) {
            if (index > size) {
                return;
            }
            if (index < 0) {
                index = 0;
            }
            size++;
            //找到要插入节点的前驱
            ListNode ptr = head;
            for (int i = 0; i < index; i++) {
                ptr = ptr.next;
            }
            ListNode toAdd = new ListNode(val);
            toAdd.next = ptr.next;
            ptr.next = toAdd;
        }

        public void deleteAtIndex(int index) {
            if (index < 0 || index >= size) {
                return;
            }
            size--;
            ListNode ptr = head;
            for (int i = 0; i < index; i++) {
                ptr = ptr.next;
            }
            ptr.next = ptr.next.next;
        }
    }

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
}
