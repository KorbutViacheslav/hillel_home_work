package home_work_13.myLists;

import java.util.NoSuchElementException;
import java.util.Objects;

public class MyLinkedList<T> implements MyList<T> {
    private MyNode<T> first;
    private MyNode<T> last;
    private int size;

    @Override
    public void add(T element) {
        MyNode<T> newMyNode = new MyNode<>(element);
        if (first == null) {
            first = last = newMyNode;
        } else {
            last.next = newMyNode;
            last = newMyNode;
        }
        size++;
    }

    @Override
    public void add(int index, T element) {
        Objects.checkIndex(index, size + 1);
        MyNode<T> newMyNode = new MyNode<>(element);
        if (first == null) {
            first = last = newMyNode;
        } else if (index == 0) {
            newMyNode.next = first;
            first = newMyNode;
        } else if (index == size) {
            last.next = newMyNode;
            last = newMyNode;
        } else {
            MyNode<T> prev = getMyNodeByIndex(index - 1);
            newMyNode.next = prev.next;
            prev.next = newMyNode;
        }
    }

    private MyNode<T> getMyNodeByIndex(int index) {
        MyNode<T> current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    @Override
    public void set(int index, T element) {
        Objects.checkIndex(index, size);
        MyNode<T> node = getMyNodeByIndex(index);
        node.element = element;
    }

    @Override
    public T get(int index) {
        Objects.checkIndex(index, size);
        return getMyNodeByIndex(index).element;
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
        T element;
        if (index == 0) {
            element = first.element;
            first = first.next;
            if (first == null) {
                last = null;
            }
        } else {
            MyNode<T> prev = getMyNodeByIndex(index - 1);
            element = prev.next.element;
            prev.next = prev.next.next;
            if (index == size - 1) {
                last = prev;
            }
        }
        size--;
        return null;
    }

    @Override
    public boolean isEmpty() {
        if (first == null) {
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
        first = last = null;
        size = 0;
    }
}
