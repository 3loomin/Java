package hw03;

public class RoundRobin implements Scheduler {
    @Override
    public void getNextCall() {
        System.out.println("call in Round Robin method");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("send Call To Agent");
    }
}
