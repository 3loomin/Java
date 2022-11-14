package ch01;
class Outer2{
    int outNum = 100;
    static int sNum = 200;


    Runnable getRunnable(final int i ){
        int num =10;

        class Myrunnable implements Runnable{
            int localNum = 1000;
            @Override
            public void run() {
                // i = 50; final로 컴파일러가 바꿔 버리기 때문에 변경은 불가능하다.
                // num = 20;
                System.out.println("i = " + i); // i 는 constant area에 저장되기 때문에 읽어오기만 가능하다
                System.out.println("num = " + num);
                System.out.println("localNum = " + localNum);
                System.out.println("outNum = " + outNum + "Outer class's instance var");
                System.out.println("Outer.sNum = " + Outer2.sNum + "Ouyter class's static var");
            }
        };
        return new Myrunnable();

    }
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            System.out.println("Runnable class");
        }
    };
}
public class AnonumousInnerTest {
    public static void main(String[] args){
        Outer2 out = new Outer2();
        Runnable runner = out.getRunnable(100);
        runner.run();
        out.runnable.run();
    }
}
