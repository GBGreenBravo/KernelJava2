package policy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PolicyFIFO implements Policy {
    public PriorityQueue<Customer> schedule(Customer[] customers) {
        PriorityQueue<Customer> queue = new PriorityQueue<>(Comparator.comparingInt(Customer::arrivalTime));

        queue.addAll(Arrays.asList(customers));

        System.out.println("FIFO 처리 방식: ");

        return queue;
    }
}
