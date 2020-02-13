package tree_set_test;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;

public class TreeSet implements Set {
    private Node root;
    private Comparator comparator;

    public TreeSet(final Comparator comparator) {
        this.comparator = comparator;
    }

    public TreeSet() {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o)
    {
        try {
            return containsRecursively(root, o);
        } catch (Exception NullPointerException) {
           return false;
        }
    }


    private boolean containsRecursively(Node treeRoot, Object o) {
        Integer oInt = (Integer) o;
        Integer currentInt = (Integer) treeRoot.getData();
        if (treeRoot == null) {
            return false;
        }
        if (treeRoot.getData().equals(oInt)) {
            return true;
        }
        return oInt < currentInt ? containsRecursively(treeRoot.getLeft(), o) : containsRecursively(treeRoot.getRight(), o);
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        Node node = new Node(o);
        if (root == null){
            root = node;
            return true;
        }
        return addRecursivelyToTree(root, o);
    }

    public boolean addRecursivelyToTree(Node treeRoot, Object o) {
        int compereResult;
        if (comparator != null){
            compereResult = comparator.compare(treeRoot.getData(), o);
        } else {
        Comparable current = (Comparable) treeRoot.getData();
        Comparable other = (Comparable) o;
        compereResult = current.compareTo(other);
        //int compereResult= current.compareTo(other);
        }
        if (compereResult < 0){
            if (treeRoot.getRight() == null) {
                treeRoot.setRight(new Node(o));
                return true;
            }
            return addRecursivelyToTree(treeRoot.getRight(), o);
        } else if (compereResult > 0) {
            if (treeRoot.getLeft() == null) {
                treeRoot.setLeft(new Node(o));
                return true;
            }
            return addRecursivelyToTree(treeRoot.getLeft(), o);
        }
        return false;
    }

//    public boolean addRecursivelyToTree(Node treeRoot, Object o) {
//        Integer oInt = (Integer) o;
//        Integer currentInt = (Integer) treeRoot.getData();
//        if (oInt.equals(currentInt)){
//            return false;
//        }
//        if (oInt > currentInt){
//            if (treeRoot.getRight() == null) {
//                treeRoot.setRight(new Node(o));
//                return true;
//            }
//            return addRecursivelyToTree(treeRoot.getRight(), o);
//        } else {
//            if (treeRoot.getLeft() == null) {
//                treeRoot.setLeft(new Node(o));
//                return true;
//            }
//            return addRecursivelyToTree(treeRoot.getLeft(), o);
//        }
//    }

//    @Override
//    public boolean add(Object o) {
//        Node node = new Node(o);
//        if (root == null){
//            root = node;
//            return true;
//        }
//        Integer oInt = (Integer) o;
//        Node current = root;
//        while (true) {
//            if (current.getData().equals(oInt)){
//                return false;
//            }
//            Integer currentInt = (Integer) current.getData();
//            if (oInt > currentInt){
//                if (current.getRight() == null){
//                    current.setRight(node);
//                    return true;
//                } else {
//                    current = current.getRight();
//                }
//            }
//            if (oInt < currentInt){
//                if (current.getLeft() == null){
//                    current.setLeft(node);
//                    return true;
//                } else {
//                    current = current.getLeft();
//                }
//            }
//        }
//    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    public String toString()
    {
        return "[" + toString(root) + "]";
    }

    private String toString(Node root)
    {
        String result = "";

        if(root == null)
        {
            return null;
        }
        else
        {
            result = result + root.getData();

            if(root.getLeft() != null || root.getRight() != null)
            {
                return result + ", " + toString(root.getLeft()) + ", " + toString(root.getRight());
//              result = result + ", " + toString(root.getLeft());
//              result = result + ", " + toString(root.getRight());
            }
        }
        return result;
    }

    public void print(){
        if (root == null){
            System.out.println("[]");
        } else {
            printRecursion(root);
        }
    }

    private void printRecursion(Node root) {
        if (root.getLeft() != null){
            printRecursion(root.getLeft());
        }
        System.out.print(root.getData() + ", ");
        if (root.getRight() != null){
            printRecursion(root.getRight());
        }
    }

}
