package ch10;

public class AICar extends Car{
    @Override
    public void drive() {
        System.out.println("Auto Pilot start");

    }

    @Override
    public void stop() {
        System.out.println("pilot is stoping");
    }

    @Override
    public void washCar(){
        System.out.println("Auto washing start");
    }
}
