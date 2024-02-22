/**
 * Create by saurabh
 * Date: 22/02/24
 * Project Name: Tutorial
 */
package queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue queue = new LinkedList();
        queue.add("Customer-First");
        queue.add("Customer-Second");
        queue.add("Customer-Third");
        queue.add("Customer-Fourth");
        queue.add("Customer-Fifth");
        while (!queue.isEmpty()){
            System.out.println(queue.remove());
        }

        Queue queue1 = new PriorityQueue();
        queue1.add(40);
        queue1.add(30);
        queue1.add(50);
        queue1.add(10);
        queue1.add(34);
        while(!queue1.isEmpty()){
            System.out.println(queue1.remove());
        }
    }
}
