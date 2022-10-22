package hw03;

public class LeastJob implements Scheduler {
    @Override
    public void getNextCall() {
        System.out.println("call in Least Job method");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("send Call To Agent");
    }
}
