package hw03;

public class Car {
    private static int serialNum = 10000;

    public int getCarNum() {
        serialNum++;
        return serialNum;
    }
}
