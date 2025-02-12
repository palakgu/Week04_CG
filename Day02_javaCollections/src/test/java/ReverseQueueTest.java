import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import queueinterface.ReverseQueue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueueTest {
    @Test
    void queueTest(){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(20);
        queue.add(30);
        queue.add(50);
        queue.add(60);
        Queue<Integer> res = new LinkedList<>(Arrays.asList(60,50,30,20));
        Assertions.assertEquals(ReverseQueue.reverseQueue(queue),res);
    }
}
