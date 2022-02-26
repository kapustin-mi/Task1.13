package cs.vsu.ru.kapustin;

public class Array<E> {
    private static final int DEFAULT_CAPACITY = 10;

    private E[] array;
    private int elementCount;
    private int capacity;

    public Array(int capacity) {
        this.array = (E[]) new Object[capacity];
        this.elementCount = 0;
        this.capacity = capacity;
    }

    public Array() {
        this.array = (E[]) new Object[DEFAULT_CAPACITY];
        this.elementCount = 0;
        this.capacity = DEFAULT_CAPACITY;
    }

    public int getElementCount() {
        return elementCount;
    }

    public boolean isEmpty() {
        return elementCount == 0;
    }

    public void add(E element) {
        if (elementCount == array.length) {
            resize(capacity * 2);
        }

        array[elementCount] = element;
        elementCount++;
    }

    private void resize(int newCapacity) {
        E[] newArray = (E[]) new Object[newCapacity];

        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
        capacity = newCapacity;
    }

    public E getElementAt(int index) {
        int indexOfLastElement = elementCount - 1;
        
        if (index >= indexOfLastElement) {
            throw new ArrayIndexOutOfBoundsException(index + " >= " + indexOfLastElement);
        }

        return array[index];
    }

    public void removeElementAt(int index) {
        if (index >= capacity) {
            throw new ArrayIndexOutOfBoundsException(index + " >= " +
                    elementCount);
        } else if (index < 0) {
            throw new ArrayIndexOutOfBoundsException(index);
        }

        E[] newArray = (E[]) new Object[capacity];
        System.arraycopy(array, 0, newArray, 0, index);
        array = newArray;
        elementCount--;
    }

    public int lastIndexOf(E element) {
        if (element == null) {
            for (int i = elementCount; i >= 0; i--) {
                if (array[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = elementCount; i >= 0; i--) {
                if (element.equals(array[i])) {
                    return i;
                }
            }
        }

        return -1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');

        for (int i = 0; i < elementCount; i++) {
            sb.append(array[i]);
            if (i != elementCount - 1) {
                sb.append(',');
            }
        }
        sb.append(']');

        return sb.toString();
    }
}
