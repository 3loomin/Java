import java.util.ArrayList;
import java.util.Collections;

public class Heap {
    public ArrayList<Integer> heapArray = null;

    public Heap(Integer data){
        heapArray = new ArrayList<>();

        heapArray.add(null);
        heapArray.add(data);

    }

    public boolean moveUp(Integer inserted_idx){
        if(inserted_idx <= 1){
            return false;
        }
        Integer parent_idx = inserted_idx / 2;
        if(this.heapArray.get(inserted_idx) > this.heapArray.get(parent_idx)){
            return true;
        }
        else {
            return false;
        }
    }
    public boolean insert(Integer data){
        Integer inserted_idx, parent_idx;
        if(heapArray == null){
            heapArray = new ArrayList<>();
            heapArray.add(null);
            heapArray.add(data);
            return true;
        }
        this.heapArray.add(data);
        inserted_idx = this.heapArray.size() -1;
        while(this.moveUp(inserted_idx)){
            parent_idx = inserted_idx/2;
            Collections.swap(this.heapArray,inserted_idx,parent_idx);
            inserted_idx = parent_idx;

        }
        return true;
    }

    public Integer pop(){
        Integer returend_data, popped_idx ,left_child, right_child;

        if(this.heapArray == null){
            return null;
        }
        else{
            returend_data = this.heapArray.get(1);
            this.heapArray.set(1,this.heapArray.get(this.heapArray.size() - 1));
            this.heapArray.remove(this.heapArray.size() - 1);
            popped_idx = 1;
            while(this.moveDown(popped_idx)){
                left_child = popped_idx * 2;
                right_child = popped_idx * 2 + 1;

                //CASE 2 오른쪽만 없을 때
                if(right_child >= this.heapArray.size()){
                    if(this.heapArray.get(popped_idx) < this.heapArray.get(left_child)){
                        Collections.swap(heapArray, popped_idx, left_child);
                        popped_idx = left_child;
                    }
                }
                //CASE 3 둘 다 없을 때
                else{
                    if(this.heapArray.get(left_child) > this.heapArray.get(right_child)){
                        if(this.heapArray.get(popped_idx) < this.heapArray.get(left_child)){
                            Collections.swap(heapArray, popped_idx, left_child);
                            popped_idx = left_child;
                        }
                    }
                    else {
                        if(this.heapArray.get(popped_idx) < this.heapArray.get(right_child)){
                            Collections.swap(heapArray, popped_idx, right_child);
                            popped_idx = right_child;
                        }
                    }
                }
            }

            return returend_data;

        }
    }

    public boolean moveDown(Integer popped_idx){
        Integer left_child, right_child;
        left_child = popped_idx * 2;
        right_child = popped_idx * 2 + 1;

        //CASE1 아예 child가 없을 때
        if(left_child >= this.heapArray.size()){
            return false;
        }
        //CASE2 왼쪽 노드만있을 때
        else if(right_child >=  this.heapArray.size()){
            if(this.heapArray.get(popped_idx) < this.heapArray.get(left_child)){
                return true; //swap 해야함!

            }
            else {
                return false;
            }
        }
        //CASE3 왼쪽 오른쪽 다 있을 때
        else{
            if(this.heapArray.get(left_child) > this.heapArray.get(right_child)){
                if(this.heapArray.get(popped_idx) < this.heapArray.get(left_child)){
                    return true;
                }
                else{
                    return false;
                }

            }
            else {
                if(this.heapArray.get(popped_idx) < this.heapArray.get(right_child)){
                    return true;
                }
                else{
                    return false;
                }

            }

        }

    }
}
