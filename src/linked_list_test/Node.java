package linked_list_test;

 class Node {
    private Object data;
    private Node next;


    public Node(Object data, Node next){
        this.data = data;
        this.next = next;
    }


    public Object getData(){
        return data;
    }


    public Node getNext(){
        return next;
    }

     public Node setNext(Node next) {
         this.next = next;
         return this;
     }
 }
