package ch01;


class OutClass{
    private int num = 10;
    private static int sNum = 20;
    private InClass inClass;
    public OutClass(){
        inClass = new InClass();
    }
    private class InClass{
        int iNum = 100;
        //static int sInNum = 200; 내부 클래스는 외부 클래스가 생성되고 생성되는 것이기 때문에 static 변수를 가질 수 없다.
        void inTest(){
            System.out.println("OutClass num = " + num + " out class's instance var");
            System.out.println("OutClass snum = " + sNum + " out class's static var");
            System.out.println("InClass num = " + iNum + " in class's instance  var");

        }
    }

    static class InStaticClass{
        int iNum = 100;
        static int sInNum = 200;
        void inTest(){
            //System.out.println("OutClass num = " + num + " out class's instance var"); // 외부 클래스가 생성되기 전에 생성되기 때문에 외부 클래스의 인스턴스의 멤버변수는 사용할 수 없다.
            System.out.println("OutClass snum = " + sNum + " out class's static var");
            System.out.println("InClass num = " + iNum + " in class's instance  var");
            System.out.println("InClass num = " + sInNum + " in class's static  var");

        }

        static void sTest(){
            System.out.println("OutClass snum = " + sNum + " out class's static var");
            //System.out.println("InClass num = " + iNum + " in class's instance  var"); //스태틱 클래스의 스태틱 메서드는 스태틱 클래스가 생성되지 않아도 생성되기 때문에 iNum을 가져올 수 없다.
            System.out.println("InClass num = " + sInNum + " in class's static  var");

        }
    }

    public void usingClass(){
        inClass.inTest();
    }
}
public class InnerTest {
    public static void main(String[] args){
        OutClass outClass = new OutClass();
        outClass.usingClass();

        System.out.println();

        OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
        sInClass.inTest();

        System.out.println();

        OutClass.InStaticClass.sTest();
    }
}
