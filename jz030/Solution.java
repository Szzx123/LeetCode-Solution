package jz030;

import java.util.Stack;

public class Solution {
    class MinStack {
        Stack<Integer> A;
        Stack<Integer> B;
        //用辅助栈B 一旦B为空 或B的底部大 就在B也放一个
        /** initialize your data structure here. */
        public MinStack() {
            A = new Stack<>();
            B = new Stack<>();
        }

        public void push(int x) {
            A.push(x);
            if (B.isEmpty() || B.peek() >= x) {
                B.push(x);
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

        public int min() {
            return B.peek();
        }
    }

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.min();
 */}
