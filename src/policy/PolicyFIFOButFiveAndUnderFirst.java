package policy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PolicyFIFOButFiveAndUnderFirst implements Policy{
    public PriorityQueue<Customer> schedule(Customer[] customers) {
        PriorityQueue<Customer> queue = new PriorityQueue<>(new FiveAndUnderFirst());

        queue.addAll(Arrays.asList(customers));

        System.out.println("FIFOButFiveAndUnderFirst 처리 방식: ");

        return queue;
    }
}

class FiveAndUnderFirst implements Comparator<Customer> {
    static int CRITERION = 5;

    @Override
    public int compare(Customer o1, Customer o2) {
        if (o1.repairingTime() > CRITERION && o2.repairingTime() > CRITERION) return (o1.arrivalTime() < o2.arrivalTime()) ? -1 : 1;
        if (o1.repairingTime() <= CRITERION && o2.repairingTime() <= CRITERION) return (o1.arrivalTime() < o2.arrivalTime()) ? -1 : 1;
        if (o1.repairingTime() <= CRITERION && o2.repairingTime() > CRITERION) return -1;
        if (o1.repairingTime() > CRITERION && o2.repairingTime() <= CRITERION) return 1;

        return 0;
    }
}