
/*
Dictionary - Словарь
Реализовать класс `Словарь`, в который можно:
1) положить слово на английском и его перевод на русский язык
2) для слова на английском узнать его перевод
 */

package dictionary_homework;

public class MyDict {
    private int capacity = 20;
    private Entry[] array = new Entry[capacity];


    public void put(String key, String value) {
        Entry entry = new Entry(key, value);
        int number = index(key);
        if (array[number] == null) {
            array[number] = entry;
        }else {
            Entry current = array[number];
            while (current.next != null) {
                current = current.next;
            }
            current.next = entry;
        }
    }

    public String get(String key) {
        int hash = index(key);
        if (array[hash] != null) {
            Entry current = array[hash];
            while (true) {
                if (current.key.equals(key)) {
                    return current.value;
                }
                if (current == null) {
                    return null;
                }
                current = current.next;
            }
        }
        return null;
    }

    private static class Entry {
        String key;
        String value;
        Entry next;

        public Entry(String key, String value){
            this.key = key;
            this.value = value;
        }
    }

    private int index(String s){
        int hash = s.hashCode();
        hash = Math.abs(hash);
        hash = hash % capacity;
        return hash;
    }

}
