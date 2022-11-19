package ch08;

public class ArrayIndexException {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        try{
            for(int i = 0; i <= 5; i++){
                System.out.println(arr[i]);
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }
        //try catch를 안하면 abort 돼서 프로그램이 죽어버린다
        System.out.println("here");

    }
}
