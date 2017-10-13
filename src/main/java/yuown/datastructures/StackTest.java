package yuown.datastructures;

import java.util.ArrayList;
import java.util.List;

public class StackTest {

    public static void main(String[] args) {

        int maxSize = 10;

        Stack<Integer> numbersStack = new Stack<Integer>(maxSize);
        for (int i = 0; i < maxSize; i++) {
            numbersStack.push(i + 1);
        }

        System.out.println();
        System.out.println("Peeked " + numbersStack.peek());
        System.out.println("Peeked " + numbersStack.peek());
        System.out.println();
        System.out.println("Stack Empty " + numbersStack.isEmpty());
        System.out.println();
        for (int i = 0; i < maxSize; i++) {
            System.out.println("Popped " + numbersStack.pop());
        }
        System.out.println();
        System.out.println("Stack Empty " + numbersStack.isEmpty());
    }
}

class Stack<T> {

    private int maxSize;

    private int size;

    private List<T> data;

    public Stack(int maxSize) {
        size = 0;
        this.maxSize = maxSize;
        this.data = new ArrayList<T>();
    }

    public void push(T newData) {
        if (size >= maxSize) {
            throw new StackOverflowException("Stack Size " + size + " is beyond maxsize " + maxSize);
        }
        ++size;
        data.add(newData);
        System.out.println("Pushed " + newData);
    }

    public T pop() {
        if (size <= 0) {
            throw new StackUnderflowException("Stack Size is " + size);
        }
        T popped = data.get(size - 1);
        data.remove(--size);
        return popped;
    }

    public T peek() {
        if (size <= 0) {
            throw new StackUnderflowException("Stack Size is " + size);
        }
        T popped = data.get(size - 1);
        return popped;
    }

    public boolean isEmpty() {
        return data.size() <= 0;
    }
}

class StackOverflowException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public StackOverflowException(String string) {
        super(string);
    }
}

class StackUnderflowException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public StackUnderflowException(String string) {
        super(string);
    }
}