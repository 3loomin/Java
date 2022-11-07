package ch06;

public class MyLinkedQueueTest {
    public static void main(String[] args){
        MyLinkedQueue queue = new MyLinkedQueue();

        queue.enQueue("A");
        queue.enQueue("B");
        queue.enQueue("C");

        queue.printQueue();

        System.out.println("deque::" + queue.deQueue());
        System.out.println("deque::" + queue.deQueue());


    }
}
