package iterator.test;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList(new Object[]{1,2,3});
        System.out.println(arrayList);
        Iterator iterator = arrayList.iterator();

        while (iterator.hasNext()){
            Object o = iterator.next();
            System.out.println(o);
        }
    }
}
