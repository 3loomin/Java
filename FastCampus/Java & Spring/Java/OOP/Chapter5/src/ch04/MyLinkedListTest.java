package ch04;

public class MyLinkedListTest {
    public static void main(String[] args){
        MyLinkedList list = new MyLinkedList();
        list.addElement("A");
        list.addElement("B");
        list.addElement("C");

        list.insertElement(0,"D");
        list.removeElement(1);
        list.prinrtAll();
    }
}
