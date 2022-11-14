package ch02;

@FunctionalInterface
public interface Add{
    public int add(int x, int y);
    //public int sub(int x , int y); @FunctionalInterface 어노테이션 때문에 한 인터페이스엔 하나의 메서드만 존재해야 된다!
}
