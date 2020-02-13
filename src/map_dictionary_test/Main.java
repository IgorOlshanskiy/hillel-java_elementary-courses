package map_dictionary_test;

public class Main {
    public static void main(String[] args){
//        MyMap myMap = new MyMap();
//        System.out.println(myMap);
//        myMap.add("google.com", 172);
//        myMap.add("utube.com", 168);
//        Integer result = myMap.get("google.com");
//        System.out.println(result);

        MyMap myMap = new MyMap();
        myMap.put("kluch","znachenie");
        myMap.put("kluch1","NovoeZnachenie");
        myMap.put("ping","test");
        myMap.put("pong","test1");
        myMap.remove("pong");
        myMap.printAll();
        Object result = myMap.get("kluch1");
        System.out.println();
        System.out.println(result);
        System.out.println(myMap.size());

    }
}
