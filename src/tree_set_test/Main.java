package tree_set_test;

import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Comparator comparator = new TreeDescComparator();
        TreeSet treeSet = new TreeSet(comparator);
//        treeSet.add(5);
//        treeSet.add(8);
//        treeSet.add(4);
//        treeSet.add(9);
//        treeSet.add(7);
//        treeSet.add(2);

//        System.out.println(treeSet.toString());
//        treeSet.print();
//        System.out.println();
//        System.out.println(treeSet.contains(1));
//        System.out.println(treeSet.contains(9));

        treeSet.add("anna");
        treeSet.add("ivan");
        treeSet.print();

    }
}
