package datastructures;

import java.util.LinkedList;

public class StackQueueImplementation implements Stack, Queue {
    private LinkedList<Integer> list;

    public StackQueueImplementation() {
        list = new LinkedList<>();
    }

    @Override
    public void push(int element) {
        list.push(element);
    }

    @Override
    public int pop() {
        return list.pop();
    }

    @Override
    public int peek() {
        return list.peek();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public void enqueue(int element) {
        list.addLast(element);
    }

    @Override
    public int dequeue() {
        return list.poll();
    }
}
