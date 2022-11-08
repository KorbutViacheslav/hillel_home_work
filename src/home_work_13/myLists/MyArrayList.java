package home_work_13.myLists;

import java.util.NoSuchElementException;
import java.util.Objects;

public class MyArrayList<T> implements MyList<T> {
    private static final int DEFAULT_CAPACITY = 5;
    private Object[] elements;
    private int size = 0;

    public MyArrayList(int initCapacity) {
        if (initCapacity <= 0) {
            throw new IllegalArgumentException();
        }
        elements = new Object[initCapacity];
    }

    public MyArrayList() {
        this(DEFAULT_CAPACITY);
    }

    @Override
    public void add(T element) {
        resizeIdNeeded();
        elements[size] = element;
        size++;
    }

    private void resizeIdNeeded() {
        if (elements.length == size) {
            Object[] newArray = new Object[elements.length * 2];
            System.arraycopy(elements, 0, newArray, 0, size);
            elements = newArray;
        }
    }

    @Override
    public void add(int index, T element) {
        Objects.checkIndex(index, size + 1);
        resizeIdNeeded();
        System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = element;
    }

    @Override
    public void set(int index, T element) {
        Objects.checkIndex(index, size);
        elements[index] = element;

    }

    @Override
    public T get(int index) {
        Objects.checkIndex(index, size);
        return (T) elements[index];
    }

    @Override
    public T getFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return get(0);
    }

    @Override
    public T getLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return get(size - 1);
    }

    @Override
    public T remove(int index) {
        Objects.checkIndex(index, size);
        T removedElement = (T) elements[index];
        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        size--;
        return removedElement;
    }

    @Override
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        size = 0;
        elements = new Object[DEFAULT_CAPACITY];
    }
}
