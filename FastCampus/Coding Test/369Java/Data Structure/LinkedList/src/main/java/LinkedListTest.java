public class LinkedListTest {
    public static void main(String[] args) {
        SingleLinkedList<Integer> MyLinkedList = new SingleLinkedList<Integer>();
        MyLinkedList.addNode(1);
        MyLinkedList.addNode(2);
        MyLinkedList.addNode(3);

        MyLinkedList.InsertNode(4,2);

        MyLinkedList.InsertNode(7,20);
        MyLinkedList.printAll();


    }
}
