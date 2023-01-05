public class SingleLinkedList<T> {

    public Node<T> head = null;

    public class Node<T> {
        T data;
        Node<T> next;

        public Node(T data){
            this.data = data;
        }
    }
    public void addNode(T data){
        if(head == null){
            head = new Node<T>(data);
        }else {
            Node<T> node = this.head;
            while(node.next != null){
                node = node.next;
            }
            node.next = new Node<T>(data);
        }
    }
    public void printAll(){
        if(head != null){
            Node<T> node = this.head;
            System.out.println(node.data);
            while(node.next != null){
                node = node.next;
                System.out.println(node.data);
            }
        }
    }

    public Node<T> search(T isData){
        if(this.head == null){
            return null;
        } else{
            Node<T> node = this.head;
            while(node != null){
                if(node.data == isData){
                    return node;
                }else{
                    node = node.next;
                }
            }
            return null;
        }

    }
    public void InsertNode(T data, T isData){
        Node<T> searchedNode = this.search(isData);
        if(searchedNode == null){
            this.addNode(data);
        } else{
            Node<T> nextNode = searchedNode.next;
            searchedNode.next = new Node<T>(data);
            searchedNode.next.next = nextNode;

        }



    }
}
