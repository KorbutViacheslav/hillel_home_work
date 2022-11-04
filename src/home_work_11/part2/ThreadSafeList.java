package home_work_11.part2;

import java.util.concurrent.CopyOnWriteArrayList;

public class ThreadSafeList<E> {
    private final CopyOnWriteArrayList<E> copyOnWriteArrayList;
    private int size = 0;

    public ThreadSafeList() {
        copyOnWriteArrayList = new CopyOnWriteArrayList<>();
    }

    public ThreadSafeList(CopyOnWriteArrayList<E> copyOnWriteArrayList) {
        this.copyOnWriteArrayList = copyOnWriteArrayList;
    }

    public synchronized void add(E element) {
        copyOnWriteArrayList.add(element);
        size++;
    }

    public synchronized E get(int i) throws IndexOutOfBoundsException {
        return copyOnWriteArrayList.get(i);
    }

    public synchronized void remove(int i) throws IndexOutOfBoundsException {
        copyOnWriteArrayList.remove(i);
        size--;
    }

    public int getSize() {
        return size;
    }

    public String toString() {
        return "ThreadSafeList " + copyOnWriteArrayList.toString();
    }
}
