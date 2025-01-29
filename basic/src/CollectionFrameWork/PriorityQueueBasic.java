package CollectionFrameWork;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueBasic {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>();
        pq.offer(10);
        pq.offer(300);
        pq.offer(1);
        pq.offer(5);
        pq.add(40);
        pq.offer(50);
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());

        System.out.println(pq.isEmpty());

        Queue<Integer> p = new PriorityQueue<>((a,b)->b-a);
        p.offer(3);
        p.offer(30);
        p.offer(100);
        p.offer(1);
        p.offer(5);
        System.out.println(p.size());
        System.out.println(p.poll());

        while(!p.isEmpty()){
            System.out.print(p.poll() + " ");
        }
        System.out.println();
    }
}
