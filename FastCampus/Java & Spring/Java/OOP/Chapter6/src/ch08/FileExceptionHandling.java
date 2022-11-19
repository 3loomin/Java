package ch08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling {
    static public void main(String[] args){
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("a.txt");
            System.out.println("Read");
           /* try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }*/ //더러웡

        } catch (FileNotFoundException e) {
            System.out.println(e);
            return;
            /*try {
                fis.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
             */ // 더러웡
        } finally { //
            if(fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("finally"); // finally는 항상 불린다
        }
        System.out.println("end");// aborting 되지 않는 것을 확인할 수 있다.

    }
}
