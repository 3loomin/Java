import java.util.ArrayList;

public class MyQueue<T> {
    private ArrayList<T> queue = new ArrayList<T>();

    public T dequeue(){
        if(queue.isEmpty()){
            return null;
        }
        return queue.remove(0);
    }
    public void enqueue(T item){
        queue.add(item);
    }

}
