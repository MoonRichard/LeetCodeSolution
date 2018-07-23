package com.leet;

import java.util.ArrayList;

public class MinStack {

    /** initialize your data structure here. */

    /**
     * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
     *
     * push(x) -- Push element x onto stack.
     * pop() -- Removes the element on top of the stack.
     * top() -- Get the top element.
     * getMin() -- Retrieve the minimum element in the stack.
     */
    ArrayList<Integer> stack;
    ArrayList<Integer> minStack;
    int size;
    public MinStack() {
        stack = new ArrayList<>();
        minStack = new ArrayList<>();
        size = 0;
    }

    public void push(int x) {
        stack.add(x);
        if (x > minStack.get(size-1)) minStack.add(minStack.get(size-1));
        minStack.add(x);
        size++;
    }

    public void pop() {
        stack.remove(size--);
        minStack.remove(size--);
    }

    public int top() {
        return stack.get(size-1);
    }

    public int getMin() {
        return stack.get(size-1);
    }
}
