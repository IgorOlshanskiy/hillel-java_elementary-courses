package iterator.test;

import java.util.Iterator;

public class ArrayListIterator implements Iterator {
    private int index = 0;
    private Object[] objects;

    public ArrayListIterator(Object[] objects) {
        this.objects = objects;
    }

    @Override
    public boolean hasNext() {
        return index < objects.length;
    }

    @Override
    public Object next() {
        Object result = objects[index];
        index++;
        return result;
    }
}
