public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue<Integer> mq = new MyQueue<Integer>();

        mq.enqueue(1);
        mq.enqueue(2);
        mq.enqueue(3);

        System.out.println(mq.dequeue());
        System.out.println(mq.dequeue());
        System.out.println(mq.dequeue());
    }
}
