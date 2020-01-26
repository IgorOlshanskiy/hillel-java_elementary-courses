package linked_list_test;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = init();
        for (Object o : linkedList) {
            System.out.println(o);
        }
        System.out.println(Arrays.asList(linkedList.toArray()));
    }

    private static LinkedList init() {
        LinkedList linkedList = new LinkedList();
//        linkedList.add(1);
//        linkedList.add(2);
//        linkedList.add(3);
        linkedList.push(1);
        linkedList.push(2);
        return linkedList;
    }

//        LinkedList linkedList = new LinkedList();
//        Iterator iterator = linkedList.iterator();

        //System.out.println("1");
//        linkedList.add(1);
//        linkedList.add(2);
//        linkedList.add(3);
//        System.out.println("3");
//        linkedList.remove(1);
//        System.out.println(Arrays.asList(linkedList.toArray()));
//        linkedList.push(3);
//        System.out.println("3");
//        linkedList.contains(2);
//        System.out.println("3");
//       linkedList.toArray();
//        System.out.println(linkedList.toString());

//        while (iterator.hasNext()){
//            Object o = iterator.next();
//            System.out.println(o);
//        }




}
