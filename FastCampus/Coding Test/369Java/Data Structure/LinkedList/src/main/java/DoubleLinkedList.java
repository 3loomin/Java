public class DoubleLinkedList<T> {
    public Node<T> head = null;
    public Node<T> tail = null;

    public class Node<T>{
        T data;
        Node<T> prev = null;
        Node<T> next = null;

        public Node(T data){
            this.data = data;
        }
    }

    public void addNode(T data){
        if(this.head == null){
            this.head = new Node<T>(data);
            this.tail = this.head;
        } else{
            Node<T> node = this.head;
            while(node.next != null){
                node = node.next;
            }
            node.next = new Node<T>(data);
            node.next.prev = node;
            this.tail = node.next;
        }
    }

    public void printAll(){
        if(this.head != null){
            Node<T> node = this.head;
            System.out.println(node.data);
            while(node.next != null){
                node = node.next;
                System.out.println(node.data);
            }
        }
    }

    public T searchFromHead(T isData){
        if(isEmpty()){
            return null;
        } else{
            Node<T> node = this.head;
            while(node.next != null){
                if(node.data == isData){
                    return node.data;
                } else {
                    node = node.next;
                }
            }
            return null;
        }
    }

    public T searchFromTail(T isData){
        if(isEmpty()){
            return null;
        } else{
            Node<T> node = this.tail;
            while(node != null){
                if(node.data == isData){
                    return node.data;
                } else {
                    node = node.prev;
                }
            }
            return null;
        }
    }

    public boolean insertNode(T data, T isData){
        if(this.head == null){
            this.head = new Node<T>(data);
            this.tail = this.head;
            return true;
        } else if(this.head.data == isData) {
            Node<T> newHead = new Node<T>(data);
            newHead.next = this.head;
            this.head = newHead;
            return true;
        } else{
            Node<T> node = this.head;
            while(node != null){
                if(node.data == isData){

                    Node<T> prevNode = node.prev;
                    prevNode.next = new Node<T>(data);
                    prevNode.next.next = node;
                    prevNode.next.prev = prevNode;
                    node.prev = prevNode.next;

                    return true;
                } else{
                    node = node.next;
                }
            }
            return false;
        }
    }


    public boolean isEmpty(){
        if(head == null) return true;
        else return false;
    }
}
