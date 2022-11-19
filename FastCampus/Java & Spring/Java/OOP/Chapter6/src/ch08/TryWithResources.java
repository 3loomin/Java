package ch08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryWithResources {
    static public void main(String[] args){
        // FileInputStream fis = null;

        try(FileInputStream fis = new FileInputStream("a.txt")) {
            //fis = new FileInputStream("a.txt");
            System.out.println("Read");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("end");// aborting 되지 않는 것을 확인할 수 있다.

    }
}
