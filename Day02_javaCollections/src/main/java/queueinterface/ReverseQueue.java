package queueinterface;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class ReverseQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(20);
        queue.add(30);
        queue.add(50);
        queue.add(60);
        System.out.println(queue);
        System.out.println(reverseQueue(queue));
    }
    public static Queue<Integer> reverseQueue(Queue<Integer> queue){
        if(queue.isEmpty()){
            return queue;
        } else {
            int front = queue.remove();
            queue = reverseQueue(queue);
            queue.add(front);
        }
        return queue;
    }
}
