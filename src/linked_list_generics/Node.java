package linked_list_generics;

class Node<T> {
    private T data;
    private Node<T> next;


    public Node(T data, Node next){
        this.data = data;
        this.next = next;
    }


    public T getData(){
        return data;
    }


    public Node<T> getNext(){
        return next;
    }

    public Node setNext(Node<T> next) {
        this.next = next;
        return this;
    }
}
