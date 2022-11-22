package ch14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest {
    public static void main(String[] args){
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("input.txt");
            System.out.println((char)fis.read());
            System.out.println((char)fis.read());
            System.out.println((char)fis.read());


        } catch (IOException e) {
            e.printStackTrace();
            try {
                fis.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (Exception ey){
                System.out.println(ey);
            }
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (Exception ez){
            System.out.println(ez);
        }
        }
        System.out.println("end");


    }
}
