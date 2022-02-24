package cs.vsu.ru.kapustin;

import java.util.EmptyStackException;

public class ArrayStack<E> extends Array<E> {

    public ArrayStack(int capacity) {
        super(capacity);
    }

    public ArrayStack() {
        super();
    }

    public void push(E element) {
        add(element);
    }

    public E pop() {
        E element;
        int lastIndex = getElementCount() - 1;

        element = peek();
        removeElementAt(lastIndex);

        return element;
    }

    public E peek() {
        int lastIndex = getElementCount() - 1;

        if (lastIndex == -1) {
            throw new EmptyStackException();
        }

        return getElementAt(lastIndex);
    }

    public boolean empty() {
        return isEmpty();
    }

    public int search(E element) {
        int i = lastIndexOf(element);

        if (i >= 0) {
            return getElementCount() - i;
        }
        return -1;
    }
}
