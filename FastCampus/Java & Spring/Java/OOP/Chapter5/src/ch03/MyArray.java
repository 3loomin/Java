package ch03;

public class MyArray {
    int[] intArr;
    int count;

    public int ARRAY_SIZE;
    public static final int ERROR_NUM = -9999999;

    public MyArray(){

        count = 0;
        ARRAY_SIZE = 10;
        intArr = new int[ARRAY_SIZE];

    }

    public MyArray(int size){

        count = 0;
        ARRAY_SIZE = size;
        intArr = new int[ARRAY_SIZE];

    }

    public void addElement(int num){
        if(count >= ARRAY_SIZE){
            System.out.println("memory is not enough");
            return;
        }
        intArr[count++] = num;
    }

    public void insertElement(int position, int num){
        if(position < 0 || position > count ){
            return ;
        }
        else if(count >= ARRAY_SIZE){
            System.out.println("This Array is full");
        }

        else{
            //int a = count - position + 1;
            for(int i = count -1 ; i >= position; i--){
                intArr[i + 1] = intArr[i];
            }
            intArr[position] = num;
            count++;

        }
    }
    //[0] [1] [2] [3] [4] >>  [0] [1] [2] [3]
    // 0   1   2   3   4  >>   0   1   3   4
    public int removeElement(int position){
        int ret = ERROR_NUM;

        if(isEmpty()) return ret;

        if(position < 0 || position > count - 1) return ret;

        ret = intArr[position];

        for(int i = position; i < count - 1; i++){
            intArr[i] = intArr[i+1];
        }
        count--;
        return ret;
    }

    public int getSize(){
        return count;
    }
    public boolean isEmpty(){
        if (count == 0){
            return true;
        }
        else return false;

    }
    public int getElement(int position){
        if(position < 0 || position > count - 1) return ERROR_NUM;
        return intArr[position];
    }

    public void printAll(){
        for(int i = 0; i < this.count; i++)
            System.out.println(intArr[i]);
    }
}
