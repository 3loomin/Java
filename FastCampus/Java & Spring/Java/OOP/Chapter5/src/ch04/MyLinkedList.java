package ch04;

public class MyLinkedList {

    private MyListNode head;
    public int count;

    public MyLinkedList(){
        this.head = null;
        this.count = 0;
    }
    public MyListNode addElement(String data){

        MyListNode newNode;
        if (head == null) {

            newNode = new MyListNode(data);
            head  = newNode;
        }
        else {

            newNode = new MyListNode(data);
            MyListNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;

        }
        count++;

        return newNode;
    }
// !! >> a >> b >> c >> !! >> d >> e >>
    public MyListNode insertElement(int position, String data){

        MyListNode newNode = new MyListNode(data);

        MyListNode pre = head;

        if(position < 0 || count < position) return null;

        if(position == 0){

            newNode.next = head;
            head = newNode;

        }
        else{

            for(int i = 0; i < position - 1 ; i++){
                pre = pre.next;
            }
            MyListNode temp = pre.next;
            pre.next = newNode;
            newNode.next = temp;
        }

        count++;
        return newNode;
    }

    public MyListNode removeElement(int position){

        MyListNode target = null;
        MyListNode pre = head;

        if(position < 0 || position > count) return null;

        if(position == 0){
            head = head.next;
        }
        else{
            for(int i = 0 ; i < position - 1 ; i++){
                pre = pre.next;
            }

            target = pre.next;
            pre.next = target.next;
        }
        count--;
        return target;

    }

    public void prinrtAll(){
        MyListNode hi = head;
        while(hi.next != null){
            System.out.println(hi.getData());
            hi = hi.next;
        }
        System.out.println(hi.getData());
    }
    public boolean isEmpty(){
        if(head == null) return true;
        else return false;

    }
}
