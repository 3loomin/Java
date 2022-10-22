package hw03;

public class PriorityAllocation implements Scheduler {
    @Override
    public void getNextCall() {
        System.out.println("call in Priority Allocation method");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("send Call To Agent");

    }
}

