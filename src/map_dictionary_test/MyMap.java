package map_dictionary_test;


public class MyMap {
    private Entry[] array = new Entry[20];

    public MyMap() {

    }

    public void add(String key, int value) {
        Entry entry = new Entry(key, value);
        int number = hash(key);
        array[number] = entry;

    }

    public Integer get(String key) {
        int hash = hash(key);
        return array[hash].value;
    }

    private static class Entry {
        public Entry(String key, Integer value){
            this.key = key;
            this.value = value;
        }
        String key;
        Integer value;
    }

    private int hash(String s){
        return s.length();
    }

}
