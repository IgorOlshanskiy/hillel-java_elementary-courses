package linked_list_test;

import java.util.Collection;
import java.util.Iterator;

public class LinkedList implements Collection {
    private Node head;
    private int size;

    public void push(Object o) {
        Node node = new Node(o, head);
        head = node;
        size += 1;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public boolean contains(Object o) {
        Node current = head;

        while (current.getNext() != null) {
            if (current.getData().equals(o)) {
                return true;
            }
            else {
                current = current.getNext();
            }
        }
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        Object[] array = new Object[size+1];
        Node current = head;
        int i = 0;
        while (current != null) {
            array[i] = current.getData();
            current = current.getNext();
            i += 1;
        }
        return array;
    }

    @Override
    public boolean add(Object o) {
        Node node = new Node(o, null);

        if (head == null){
            head = node;
            return true;
        }
        //Node prev = null;
        Node current = head;
        while (current.getNext() != null) {
            //prev = current; // prev.next = current.next
            current = current.getNext();
        }
        current.setNext(node);
        size += 1;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        Node prev = null;
        Node current = head;
        while (current.getData() != o) {
            prev = current; // prev.next = current.next
            current = current.getNext();
        }
        prev.setNext(current.getNext());
        size -= 1;

        return true;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {
        head = null;

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
}
