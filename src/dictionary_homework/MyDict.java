
/*
Dictionary - Словарь
Реализовать класс `Словарь`, в который можно:
1) положить слово на английском и его перевод на русский язык
2) для слова на английском узнать его перевод
 */

package dictionary_homework;

public class MyDict {
    private Entry[] array = new Entry[100];

    public MyDict() {
    }

    public void put(String key, String value) {
        Entry entry = new Entry(key, value);
        int number = hash(key);
        array[number] = entry;

    }

    public String get(String key) {
        int hash = hash(key);
        return array[hash].value;
    }

    private static class Entry {
        public Entry(String key, String value){
            this.key = key;
            this.value = value;
        }
        String key;
        String value;
    }

    private int hash(String s){
        return s.length();
    }

}
