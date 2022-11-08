package ch07;

public class Printer3Test {
    public static void main(String[] args){
        Powder powder = new Powder();
        Printer3 printer = new Printer3();

        printer.setMaterial(powder);
        Powder p = (Powder)printer.getMaterial(); //getMaterial을 통해 Object 형으로 넘어오기 때문에 무조건 형변환

    }
}
