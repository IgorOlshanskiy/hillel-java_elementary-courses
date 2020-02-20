package linked_list_generics;

import java.util.Iterator;

public class LinkedListIterator implements Iterator {
    private Node current;


    public LinkedListIterator(Node head) {
        current = head;
    }


    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public Object next() {
        if(hasNext()){
            Object data = current.getData();
            current = current.getNext();
            return data;
        }
        return null;
    }
}
