package home_work_11.part2;

import java.util.concurrent.CopyOnWriteArrayList;

public class ThreadSafeList<E> extends CopyOnWriteArrayList<E> {
    @Override
    public E get(int index) {
        return super.get(index);
    }

    @Override
    public E remove(int index) {
        return super.remove(index);
    }

    @Override
    public boolean add(E e) {
        return super.add(e);
    }
}
