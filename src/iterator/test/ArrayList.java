package iterator.test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class ArrayList implements Collection {

    private Object[] objects;

    public ArrayList(Object[] objects) {
        this.objects = objects;
    }


    @Override
    public int size() {
        return objects.length;
    }

    @Override
    public boolean isEmpty() {
        return objects.length == 0;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return new ArrayListIterator(objects);
    }

    @Override
    public Object[] toArray() {
        return objects;
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    @Override
    public String toString() {
        return Arrays.toString(objects);
    }
}
