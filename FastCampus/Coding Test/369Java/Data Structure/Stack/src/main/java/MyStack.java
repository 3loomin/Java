import java.lang.reflect.Array;
import java.util.ArrayList;

public class MyStack<T> {
    private ArrayList<T> ms = new ArrayList<T>();
    public void push(T item){
        ms.add(item);
    }
    public T pop(){
        if(ms.isEmpty()){
            return null;
        }
        return ms.remove(ms.size() - 1);
    }


}
