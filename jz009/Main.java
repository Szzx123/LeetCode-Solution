package jz009;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    class CQueue {
        Deque<Integer> stack1;
        Deque<Integer> stack2;
        public CQueue() {
            stack1 = new ArrayDeque<Integer>();
            stack2 = new ArrayDeque<Integer>();
        }

        public void appendTail(int value) {
            stack1.push(value);
        }

        public int deleteHead() {
            if (stack2.isEmpty()) {
                if (stack1.isEmpty()) {
                    return -1;
                }
                changeStack();
            }
            return stack2.pop();
        }

        public void changeStack() {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
    }

}
