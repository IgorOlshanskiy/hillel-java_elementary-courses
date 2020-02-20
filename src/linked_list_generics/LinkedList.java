package linked_list_generics;

import java.util.Collection;
import java.util.Iterator;

public class LinkedList<E> implements Collection<E> {
    private Node<E> head;
    private int size;

    public void push(E o) {
        Node node = new Node(o, head);
        head = node;
        size++;
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
        while (current.getData() != null) {
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
        return new LinkedListIterator(head);
    }

    @Override
    public Object[] toArray() {
        Object[] array = new Object[size];
        Node current = head;
        int i = 0;
        while (current != null) {
            array[i] = current.getData();
            current = current.getNext();
            i++;
        }
        return array;
    }

    @Override
    public boolean add(E o) {
        Node node = new Node(o, null);
        if (head == null){
            head = node;
            size++;
            return true;
        }
        //Node prev = null;
        Node current = head;
        while (current.getNext() != null) {
            //prev = current; // prev.next = current.next
            current = current.getNext();
        }
        current.setNext(node);
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        if (o == null){
            return false;
        }
        if (head == null){
            return false;
        }
        if (head.getData().equals(o)){
            head = head.getNext();
            size--;
            return true;
        }
        Node prev = null;
        Node current = head;
        while (current.getData() != o) {
            prev = current; // prev.next = current.next
            current = current.getNext();
        }
        prev.setNext(current.getNext());
        size--;
        return true;
    }

    @Override
    public boolean addAll(Collection c) {
        E[] objects = (E[]) c.toArray();
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

    @Override
    public String toString() {
        String result = "[";
        Node current = head;
        while (current != null) {
            //prev = current; // prev.next = current.next
            result += current.getData() + ", ";
            current = current.getNext();
        }
        return result + "]";
    }
}
