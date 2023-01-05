public class LinkedListTest {
    public static void main(String[] args) {
        SingleLinkedList<Integer> MyLinkedList = new SingleLinkedList<Integer>();
        MyLinkedList.addNode(1);
        MyLinkedList.addNode(2);
        MyLinkedList.addNode(3);

        MyLinkedList.insertNode(4,2);
        MyLinkedList.insertNode(7,20);

        MyLinkedList.delNode(3);
        MyLinkedList.delNode(1);
        MyLinkedList.delNode(7);
        MyLinkedList.delNode(100);

        MyLinkedList.printAll();

        System.out.println();
        DoubleLinkedList<Integer> MyDoubleLinkedList = new DoubleLinkedList<Integer>();

        MyDoubleLinkedList.addNode(1);
        MyDoubleLinkedList.addNode(2);
        MyDoubleLinkedList.addNode(3);
        MyDoubleLinkedList.addNode(4);


       // System.out.println(MyDoubleLinkedList.searchFromHead(3));
        //System.out.println(MyDoubleLinkedList.searchFromHead(5));

       // System.out.println(MyDoubleLinkedList.searchFromTail(2));
        //System.out.println(MyDoubleLinkedList.searchFromTail(4));
        MyDoubleLinkedList.insertNode(5,2);

        //MyDoubleLinkedList.insertNode(6,1);
        MyDoubleLinkedList.printAll();

    }
}
