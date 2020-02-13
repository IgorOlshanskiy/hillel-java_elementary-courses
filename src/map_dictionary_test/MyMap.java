package map_dictionary_test;


import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class MyMap implements Map {
    private int capacity = 20;
    private Entry[] array = new Entry[capacity];
    private int size;

    private static class Entry {
        Object key;
        Object value;
        Entry next;

        public Entry(Object key, Object value, Entry next){
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

    @Override
    public Object get(Object key) {
        int hash = index(key);
        if (array[hash] == null){
            return null;
        } else {
            Entry current = array[hash];
            while (current != null) {
                if (current.key.equals(key))
                    return current.value;
                current = current.next;
            }
            return null;
        }

//        int hash = index(key);
//        if (array[hash] != null) {
//            Entry current = array[hash];
//            while (true) {
//                if (current.key.equals(key)) {
//                    return current.value;
//                }
//                if (current == null) {
//                    return null;
//                }
//                current = current.next;
//            }
//        }
//        return null;
    }

    @Override
    public Void put(Object key, Object value) {
        int hash = index(key);
        Entry entry = new Entry(key, value, null);
        if (array[hash] == null){
            array[hash] = entry;
            size++;
        } else {
            Entry previous = null;
            Entry current = array[hash];
            while (current != null) {
                if (current.key.equals(key)) {
                    if (previous == null) {
                        entry.next = current.next;
                        array[hash] = entry;
                    } else {
                        entry.next = current.next;
                        previous.next = entry;
                    }
                }
                previous = current;
                current = current.next;
            }
            previous.next = entry;
        }

//        Entry entry = new Entry(key, value);
//        int number = index(key);
//        if (array[number] == null) {
//            array[number] = entry;
//        }else {
//            Entry current = array[number];
//            while (current.next != null) {
//                current = current.next;
//            }
//            current.next = entry;
//        }
        return null;
    }

    @Override
    public Void remove(Object key) {
        int hash = index(key);
        if (array[hash] == null){
            return null;
        } else
        {
            Entry previous = null;
            Entry current = array[hash];
            while (current != null) {
                if (current.key.equals(key)){
                    if (previous == null){
                        array[hash] = array[hash].next;
                    } else {
                        previous.next = current.next;
                    }
                }
                previous = current;
                current = current.next;
            }
        }
        return null;
    }

    public void printAll(){
        for(int i=0; i<capacity; i++){
            if(array[i]!=null){
                Entry entry = array[i];
                while(entry!=null){
                    System.out.print("{"+entry.key+"="+entry.value+"}" +", ");
                    entry=entry.next;
                }
            }
        }

    }

    private int index(Object key){
//        int hash = key.hashCode();
//        hash = Math.abs(hash);
//        hash = hash % capacity;
//        return hash;
        return Math.abs(key.hashCode()) % capacity;
    }


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public void putAll(Map m) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Set keySet() {
        return null;
    }

    @Override
    public Collection<Void> values() {
        return null;
    }

    @Override
    public Set<Map.Entry> entrySet() {
        return null;
    }

}
