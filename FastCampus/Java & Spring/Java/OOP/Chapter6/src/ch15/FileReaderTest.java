package ch15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args){

        //try(FileInputStream fis = new FileInputStream("reader.txt")){ //깨짐
      try(FileReader fr = new FileReader( "reader.txt")){
            int i;
            while( (i = fr.read()) != -1){
                System.out.print((char)i);
                }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
