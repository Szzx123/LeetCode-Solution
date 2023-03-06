package lc155;

import java.util.Stack;

public class Solution {
    class MinStack {
        Stack<Integer> A;
        Stack<Integer> B;
        public MinStack() {
            A = new Stack<>();
            B = new Stack<>();
        }

        public void push(int val) {
            A.push(val);
            if (B.isEmpty() || B.peek() >= val) {
                B.push(val);
            }
        }

        public void pop() {
            if (A.pop().equals(B.peek())) {
                B.pop();
            }
        }

        public int top() {
            return A.peek();
        }

        public int getMin() {
            return B.peek();
        }
    }

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
}
