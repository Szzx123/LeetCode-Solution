package lc22;

public class Solution {
    

//    public ListNode swapPairs(ListNode head) {
//        ListNode dummyHead = new ListNode(0);
//        dummyHead.next = head;
//        ListNode tmp = dummyHead;
//        while(tmp.next != null && tmp.next.next != null) {
//            ListNode node1 = tmp.next;
//            ListNode node2 = tmp.next.next;
//            //没有这句话 dummyhead就没接上2
//            tmp.next = node2;
//            node1.next = node2.next;
//            node2.next = node1;
//            tmp = node1;
//        }
//        return dummyHead.next;
//    }
}
