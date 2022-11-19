package ch09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowException {
    //throws는 이 메서드를 사용하는 쪽에서 처리하게끔 예외처리를 미루겠다는 의미
    public Class loadClass(String fileName, String className) throws ClassNotFoundException, FileNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        Class c = Class.forName(className);
        return c;
    }
    public static void main(String[] args){
        ThrowException test = new ThrowException();
        try {
            test.loadClass("a.txt", "abc");
        } catch (ClassNotFoundException e) { // 이 예외와
            System.out.println(e);
        } catch (FileNotFoundException e) { // 이 예외를 | 연산으로 Multi-Excettion으로 처리할 수 있다
            System.out.println(e);
        }

        ThrowException test1 = new ThrowException();

        try {
            test1.loadClass("a.txt", "java.lang.String");
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch(Exception e){ // exception이 가장 상위에 있으므로 맨 밑에 있으므로 default처리로 쓸 수 있다.
            System.out.println(e);
        }


        //aborting 안되는지 확인용
        System.out.println("end");
    }
}
