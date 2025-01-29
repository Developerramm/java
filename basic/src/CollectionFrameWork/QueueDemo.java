package CollectionFrameWork;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        System.out.println("Queue in collection framework");
        // queue implementation using queue
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);

        System.out.println(q.size());

        // print using for each loop
        for(int item : q){
            System.out.print(item + " ");
        }
        System.out.println();

        q.offer(100);
        q.offer(200);
        q.offer(300);

        System.out.println(q.size());

        System.out.println(q.element());
        System.out.println(q.peek());

        System.out.println(q.remove());
        System.out.println(q.poll());

        System.out.println(q.size());

        // convert queue to array
        Object[] arr = q.toArray();
        for(Object item : arr){
            System.out.print(item + " ");
        }
        System.out.println();

        // print queue through iterator
        Iterator<Integer> it = q.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }
}
