public class NodeMgmt {
    Node head = null;

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

    public Node searchNode(int data){
        //case1 node가 하나도 없을 때
        if(head == null){
            return null;
        } else { //case2 node가 하나 이상 있을 때
            Node findNode = this.head;
            while(findNode != null){
                if(findNode.value == data){
                    return findNode;
                } else if( data < findNode.value){ //left로 보내
                    findNode = findNode.left;
                } else {
                    findNode = findNode.right;
                }
            }
            // 여기 까지 왔다면, 왼쪽 오른쪽 다 뒤져봐도 해당 데이터의 값이 없을 때이다
            return null;

        }


    }

    public boolean deleteNode(int data){
        boolean searched = false;

        Node currParentNode = this.head; // 삭제할 노드의 부모 노드
        Node currNode = this.head; //삭제할 노드
        //corner case 1 Node가 하나도 없을 떄
        if(head == null){
            return false;
        }
        //corner case 2 Node가 하나인데, root Node일 때
        else {
            if(this.head.value == data && this.head.left == null && this.head.right == null){
                this.head = null;
                return true;
            }
        }

        while (currNode != null){
            if(currNode.value == data){
                searched = true;
                break;
            } else if(data < currNode.value){
                currParentNode = currNode;
                currNode = currNode.left;
            } else {
                currParentNode = currNode;
                currNode = currNode.right;
            }
        }
        //삭제할 녀석을 못 찾았을 떄
        if(searched == false){
            return false;
        }
        //여기까지 실행 됐다면,currNode가 target, currParentNode는 currNode의 부모Node
        //case1 삭제할 Node가 Leaf Node일 경우

        if(currNode.left == null && currNode.right == null){
            if(data < currParentNode.value){ // currNode 가 currParentNode의 왼쪽에 있는가?
                currParentNode.left = null;
                currNode = null;
            } else {
                currParentNode.right = null;
                currNode = null;
            }
            return true;
            //삭제할 Node가 Child Node를 하나 가지고 있을 떄
        }
        else if(currNode.left != null && currNode.right == null){
           //case 2-1 삭제할 노드가 차일드 노드를 하나 가지고 있는데 왼쪽일 경우
            if(data < currParentNode.value){
                currParentNode.left = currNode.left;
                currNode = null;
            } else {
                currParentNode.right = currNode.left;
                currNode = null;
            }
        }
        else if(currNode.left == null && currNode.right != null){
            //case 2-2 삭제할 노드가 차일드 노드를 하나가지고 있는데 오른쪽일 경우
            if( data < currParentNode.value) {
                currParentNode.left = currNode.right;
                currNode = null;
            } else {
                currParentNode.right = currNode.right;
                currNode = null;
            }
            return true;
            //case3-1 삭제할 Node가 Child가 두개이고, Parent의 왼쪽에 있는 경우
        }
        else{
            if(data < currParentNode.value){
                Node changeNode = currNode.right;
                Node changeParentNode = currNode.right;

                while(changeNode.left != null){
                    changeParentNode = changeNode;
                    changeNode = changeNode.left;
                }
                // changeNode에는 삭제할 Node 기준 오른쪽에서 가장 작은 값을 지정하게 된다.


                //case3-1-2: changeNode의 ChildNode가 오른쪽에 있을 떄
                if(changeNode.right != null){

                    changeParentNode.left = changeNode.right;
                }
                //case3-1-1: changeNode의 ChildNode가 없을 때
                else{
                    changeParentNode.left = null;
                }
                currParentNode.left = changeNode;
                changeNode.left = currNode.left;
                changeNode.right = currNode.right;
                currNode = null;


            }
            else{
                Node changeNode = currNode.right;
                Node changeParentNode = currNode.right;

                while(changeNode.left != null){
                    changeParentNode = changeNode;
                    changeNode = changeNode.left;
                }

                if(changeNode.right != null){
                    changeParentNode.left = changeNode.right;
                }
                //case3-1-1: changeNode의 ChildNode가 없을 때
                else{
                    changeParentNode.left = null;
                }
                currParentNode.right = changeNode;
                changeNode.left = currNode.left;
                changeNode.right = currNode.right;
                currNode = null;
            }
        }
        return true;
    }
}
