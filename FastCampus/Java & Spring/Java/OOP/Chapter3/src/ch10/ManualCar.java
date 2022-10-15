package ch10;

public class ManualCar extends Car{

    @Override
    public void drive() {
        System.out.println("human is driving");
    }

    @Override
    public void stop() {
        System.out.println("human use its brake");
    }
}
