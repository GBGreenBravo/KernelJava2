package policy;

import java.util.PriorityQueue;

public interface Policy {
    PriorityQueue<Customer> schedule(Customer[] customers);
}
