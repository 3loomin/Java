public class NodeMgmt {

    Node head = null;
    public class Node{
        Node left;
        Node right;

        int value;
        Node(int data){
            this.value = left.value;
            this.left = null;
            this.right = null;
        }
    }

    public  boolean insertNode(int data){
        //case1. node가 하나도 없을 때
        if(head == null){
            this.head = new Node(data);
        } else {
            //case2 node가 하나 이상 있을 떄
            Node findNode = this.head;
            while(true){
                //case2-1 현재 노드의 왼쪽에 노드가 생겨야 할 때
                if(data < findNode.value ){
                    if(findNode.left != null){
                        findNode = findNode.left;
                    } else{
                        findNode.left = new Node(data);
                        break;
                    }
                    //case 2-2 현재 노드의 오른쪽에 노드가 생겨야 할 때
                } else {
                    if(findNode.right != null){
                        findNode = findNode.right;
                    } else {
                        findNode.right = new Node(data);
                        break;
                    }
                }
            }
        }
        return true;
    }
}
