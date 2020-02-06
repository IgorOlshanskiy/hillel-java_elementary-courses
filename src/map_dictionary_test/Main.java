package map_dictionary_test;

public class Main {
    public static void main(String[] args){
        MyMap myMap = new MyMap();
        System.out.println(myMap);
        myMap.add("google.com", 172);
        myMap.add("utube.com", 168);
        Integer result = myMap.get("google.com");
        System.out.println(result);
    }
}
