package t232;

import java.util.Stack;

public class MyQueue {

    Stack<Integer> s = new Stack<>();
    Stack<Integer> sQueue = new Stack<>();

    /**
     * Initialize your data structure here.
     */
    public MyQueue() {

    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {

        while (!sQueue.isEmpty())
            s.push(sQueue.pop());

        sQueue.push(x);

        while (!s.isEmpty())
            sQueue.push(s.pop());

    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        if (sQueue.isEmpty()) return -1;
        return sQueue.pop();
    }

    /**
     * Get the front element.
     */
    public int peek() {
        if (sQueue.isEmpty()) return -1;
        return sQueue.peek();
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return sQueue.isEmpty();
    }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();

        queue.push(1);
        queue.push(2);
        System.out.println(queue.peek());  // 返回 1
        System.out.println(queue.pop());   // 返回 1
        System.out.println(queue.empty()); // 返回 false
    }
}
