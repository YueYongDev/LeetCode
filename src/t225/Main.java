package t225;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/implement-stack-using-queues/
 */

class MyStack {

    List<Integer> list = new ArrayList<Integer>();

    /** Initialize your data structure here. */
    public MyStack() {

    }

    /** Push element x onto stack. */
    public void push(int x) {
        list.add(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if(list.isEmpty()) return -1;
        return list.remove(list.size()-1);
    }

    /** Get the top element. */
    public int top() {
        if(list.isEmpty()) return -1;
        return list.get(list.size()-1);
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return list.isEmpty();
    }
}