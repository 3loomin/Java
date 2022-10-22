package hw03;

import java.io.IOException;

public class SchedulerTest {
    public static void main(String[] args) throws IOException {

        System.out.println("R : Round Robin");
        System.out.println("L : Least Job");
        System.out.println("P : Priority Allocation");
        System.out.println("Set your allocation method ");

        int ch = System.in.read();

        Scheduler scheduler = null;

        if( ch == 'r' || ch == 'R'){
            scheduler = new RoundRobin();
        }
        else if(ch == 'l' || ch == 'L'){
            scheduler = new LeastJob();
        }
        else if(ch == 'P' || ch == 'p'){
            scheduler = new PriorityAllocation();
        }
        else{
            System.out.println("Try again ");
            return;
        }

        scheduler.getNextCall();
        scheduler.sendCallToAgent();



    }
}
